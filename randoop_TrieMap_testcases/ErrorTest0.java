import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = strTrieMap0.toString();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strTrieMap0.toString();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.util.Map<java.lang.String, java.io.Serializable> strMap1 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = strTrieMap0.toString();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strTrieMap0.toString();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = strTrieMap0.toString();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strTrieMap0.toString();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = strTrieMap0.toString();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = strTrieMap0.toString();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        int int6 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean9 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strTrieMap0.toString();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        boolean boolean1 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = strTrieMap0.toString();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        boolean boolean12 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable13 = strTrieMap0.put("hi!", (java.io.Serializable) "");
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        boolean boolean11 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Serializable serializable13 = strTrieMap0.remove("");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap11 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable13 = strTrieMap11.get("hi!");
        java.io.Serializable serializable15 = strTrieMap11.get("");
        strTrieMap11.clear();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap18 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable20 = strTrieMap18.get("hi!");
        java.io.Serializable serializable22 = strTrieMap18.get("");
        java.lang.Class<?> wildcardClass23 = strTrieMap18.getClass();
        java.io.Serializable serializable24 = strTrieMap11.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) wildcardClass23);
        java.io.Serializable serializable25 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) "\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str27 = strTrieMap0.toString();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.util.Map<java.lang.String, java.io.Serializable> strMap1 = strTrieMap0.toMap();
        java.io.Serializable serializable3 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strTrieMap0.toString();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.lang.String str10 = strTrieMap0.toString();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.io.Serializable serializable14 = strTrieMap0.remove("");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        boolean boolean8 = strTrieMap0.contains("hi!");
        boolean boolean9 = strTrieMap0.validate();
        java.io.Serializable serializable11 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int11 = strTrieMap0.size();
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean14 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.get("");
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strTrieMap0.toString();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean16 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strTrieMap0.toString();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        boolean boolean8 = strTrieMap0.contains("hi!");
        boolean boolean9 = strTrieMap0.validate();
        java.io.Serializable serializable11 = strTrieMap0.get("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.remove("");
        boolean boolean12 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.lang.String str10 = strTrieMap0.toString();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.validate();
        boolean boolean12 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable17 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.remove("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        int int14 = strTrieMap0.size();
        boolean boolean15 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.io.Serializable serializable10 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap14 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable16 = strTrieMap14.get("hi!");
        strTrieMap14.clear();
        java.io.Serializable serializable19 = strTrieMap14.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap20 = strTrieMap14.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap21 = strTrieMap14.toMap();
        java.lang.Class<?> wildcardClass22 = strTrieMap14.getClass();
        java.io.Serializable serializable23 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass22);
        java.util.Map<java.lang.String, java.io.Serializable> strMap24 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strTrieMap0.toString();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.get("hi!");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap8 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable10 = strTrieMap8.get("");
        java.io.Serializable serializable12 = strTrieMap8.get("hi!");
        strTrieMap8.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap8.toMap();
        strTrieMap8.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap8.toMap();
        boolean boolean17 = strTrieMap8.validate();
        boolean boolean19 = strTrieMap8.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable22 = strTrieMap8.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap23 = strTrieMap8.toMap();
        java.io.Serializable serializable25 = strTrieMap8.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap27 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable29 = strTrieMap27.get("hi!");
        strTrieMap27.clear();
        java.io.Serializable serializable32 = strTrieMap27.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap33 = strTrieMap27.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap34 = strTrieMap27.toMap();
        java.lang.Class<?> wildcardClass35 = strTrieMap27.getClass();
        java.io.Serializable serializable36 = strTrieMap8.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n", (java.io.Serializable) wildcardClass35);
        java.io.Serializable serializable37 = strTrieMap0.put("hi!", (java.io.Serializable) "\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str39 = strTrieMap0.toString();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean14 = strTrieMap0.validate();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        int int5 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean18 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean15 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean18 = strTrieMap0.contains("hi!");
        int int19 = strTrieMap0.size();
        int int20 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.get("");
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        strTrieMap0.clear();
        int int8 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        int int8 = strTrieMap0.size();
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        boolean boolean11 = strTrieMap0.validate();
        java.io.Serializable serializable13 = strTrieMap0.remove("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        java.lang.String str16 = strTrieMap0.toString();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.get("");
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("");
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable20 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable19 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strTrieMap0.toString();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        int int8 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        boolean boolean14 = strTrieMap0.contains("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        strTrieMap0.clear();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("");
        boolean boolean11 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        strTrieMap0.clear();
        boolean boolean17 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        int int9 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        int int12 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean18 = strTrieMap0.contains("hi!");
        int int19 = strTrieMap0.size();
        int int20 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean23 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strTrieMap0.toString();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.get("");
        boolean boolean13 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        strTrieMap0.clear();
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        strTrieMap0.clear();
        strTrieMap0.clear();
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        boolean boolean11 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean14 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        strTrieMap0.clear();
        java.io.Serializable serializable14 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.validate();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        int int14 = strTrieMap0.size();
        int int15 = strTrieMap0.size();
        int int16 = strTrieMap0.size();
        int int17 = strTrieMap0.size();
        boolean boolean19 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean9 = strTrieMap0.contains("");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        int int14 = strTrieMap0.size();
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        strTrieMap0.clear();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap7 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable9 = strTrieMap7.get("hi!");
        java.io.Serializable serializable11 = strTrieMap7.get("");
        java.lang.Class<?> wildcardClass12 = strTrieMap7.getClass();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) wildcardClass12);
        int int14 = strTrieMap0.size();
        int int15 = strTrieMap0.size();
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        java.lang.String str16 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap18 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("");
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        java.io.Serializable serializable12 = strTrieMap0.get("");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.validate();
        strTrieMap0.clear();
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        boolean boolean8 = strTrieMap0.contains("hi!");
        int int9 = strTrieMap0.size();
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean6 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("");
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap19 = strTrieMap0.toMap();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap21 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable23 = strTrieMap21.get("");
        boolean boolean25 = strTrieMap21.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap27 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable29 = strTrieMap27.get("hi!");
        java.io.Serializable serializable31 = strTrieMap27.get("");
        java.lang.Class<?> wildcardClass32 = strTrieMap27.getClass();
        java.io.Serializable serializable33 = strTrieMap21.put("hi!", (java.io.Serializable) wildcardClass32);
        java.io.Serializable serializable34 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) "hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str36 = strTrieMap0.toString();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.validate();
        java.io.Serializable serializable14 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        int int12 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int18 = strTrieMap0.size();
        boolean boolean19 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int11 = strTrieMap0.size();
        int int12 = strTrieMap0.size();
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        int int7 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean10 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        int int16 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        java.lang.String str8 = strTrieMap0.toString();
        java.lang.String str9 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        java.io.Serializable serializable9 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) '#');
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        java.io.Serializable serializable9 = strTrieMap0.put("hi!", (java.io.Serializable) (byte) 10);
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        java.io.Serializable serializable14 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("");
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean15 = strTrieMap0.validate();
        boolean boolean16 = strTrieMap0.validate();
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        int int8 = strTrieMap0.size();
        int int9 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        boolean boolean1 = strTrieMap0.validate();
        boolean boolean2 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = strTrieMap0.toString();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int9 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        boolean boolean18 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.remove("");
        boolean boolean12 = strTrieMap0.contains("");
        boolean boolean14 = strTrieMap0.contains("");
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.io.Serializable serializable8 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) true);
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        strTrieMap0.clear();
        int int8 = strTrieMap0.size();
        strTrieMap0.clear();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        strTrieMap0.clear();
        int int14 = strTrieMap0.size();
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        boolean boolean12 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("");
        boolean boolean11 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean15 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int8 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (byte) 0);
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable17 = strTrieMap0.remove("");
        int int18 = strTrieMap0.size();
        boolean boolean20 = strTrieMap0.contains("");
        java.io.Serializable serializable22 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strTrieMap0.toString();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        strTrieMap0.clear();
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean12 = strTrieMap0.contains("");
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean15 = strTrieMap0.validate();
        java.io.Serializable serializable17 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int7 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.contains("");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (byte) 0);
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable17 = strTrieMap0.remove("");
        int int18 = strTrieMap0.size();
        boolean boolean20 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.validate();
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        int int8 = strTrieMap0.size();
        int int9 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        java.io.Serializable serializable16 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap9 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.lang.Class<?> wildcardClass10 = strTrieMap9.getClass();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass10);
        boolean boolean13 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable15 = strTrieMap0.get("hi!");
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        boolean boolean12 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.validate();
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        java.io.Serializable serializable14 = strTrieMap0.remove("hi!");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable19 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean20 = strTrieMap0.validate();
        int int21 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int6 = strTrieMap0.size();
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("hi!");
        int int16 = strTrieMap0.size();
        boolean boolean17 = strTrieMap0.validate();
        boolean boolean19 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable16 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) 10.0f);
        boolean boolean18 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable20 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strTrieMap0.toString();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.get("");
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        int int6 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        boolean boolean19 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        boolean boolean20 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int22 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strTrieMap0.toString();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable16 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) 10.0f);
        boolean boolean18 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        boolean boolean21 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean22 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strTrieMap0.toString();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.get("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.validate();
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable15 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean9 = strTrieMap0.contains("");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("");
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        int int6 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        int int4 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strTrieMap0.toString();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        int int12 = strTrieMap0.size();
        boolean boolean13 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int7 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        boolean boolean8 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.validate();
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable16 = strTrieMap0.remove("");
        java.io.Serializable serializable18 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap8 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable10 = strTrieMap8.get("");
        java.io.Serializable serializable12 = strTrieMap8.get("hi!");
        strTrieMap8.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap8.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap8.toMap();
        strTrieMap8.clear();
        java.io.Serializable serializable19 = strTrieMap8.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable21 = strTrieMap8.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap8.clear();
        java.lang.Class<?> wildcardClass23 = strTrieMap8.getClass();
        java.io.Serializable serializable24 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass23);
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strTrieMap0.toString();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean10 = strTrieMap0.validate();
        int int11 = strTrieMap0.size();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.remove("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        boolean boolean6 = strTrieMap0.contains("");
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        boolean boolean14 = strTrieMap0.contains("");
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        int int14 = strTrieMap0.size();
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        java.io.Serializable serializable14 = strTrieMap0.remove("hi!");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable19 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        java.io.Serializable serializable9 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        java.io.Serializable serializable17 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable11 = strTrieMap0.get("hi!");
        int int12 = strTrieMap0.size();
        java.io.Serializable serializable14 = strTrieMap0.remove("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        strTrieMap0.clear();
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        boolean boolean15 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        int int17 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("");
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.lang.String str18 = strTrieMap0.toString();
        int int19 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.io.Serializable serializable15 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.get("");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        int int15 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        strTrieMap0.clear();
        boolean boolean19 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        int int20 = strTrieMap0.size();
        int int21 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int9 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        int int12 = strTrieMap0.size();
        boolean boolean13 = strTrieMap0.validate();
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.validate();
        java.io.Serializable serializable14 = strTrieMap0.remove("");
        java.io.Serializable serializable16 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean6 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean18 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable20 = strTrieMap0.remove("hi!");
        boolean boolean21 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        java.io.Serializable serializable9 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) 10.0f);
        int int10 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        boolean boolean15 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        int int4 = strTrieMap0.size();
        java.io.Serializable serializable6 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strTrieMap0.toString();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable8 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        java.io.Serializable serializable9 = strTrieMap0.put("hi!", (java.io.Serializable) (byte) 10);
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        int int12 = strTrieMap0.size();
        int int13 = strTrieMap0.size();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.validate();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean16 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap17 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean16 = strTrieMap0.contains("");
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        boolean boolean1 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap2 = strTrieMap0.toMap();
        java.io.Serializable serializable4 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = strTrieMap0.toString();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        int int8 = strTrieMap0.size();
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean14 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        int int13 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        int int8 = strTrieMap0.size();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 'a');
        strTrieMap0.clear();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int17 = strTrieMap0.size();
        java.io.Serializable serializable19 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap18 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap19 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.validate();
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean13 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        int int11 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.validate();
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        boolean boolean16 = strTrieMap0.validate();
        java.io.Serializable serializable18 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean18 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable21 = strTrieMap0.get("hi!");
        boolean boolean23 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap24 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strTrieMap0.toString();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 'a');
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.util.Map<java.lang.String, java.io.Serializable> strMap1 = strTrieMap0.toMap();
        java.io.Serializable serializable3 = strTrieMap0.remove("");
        java.io.Serializable serializable5 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (byte) 1);
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        java.io.Serializable serializable14 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n", (java.io.Serializable) "\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap16 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable18 = strTrieMap16.get("");
        boolean boolean19 = strTrieMap16.validate();
        boolean boolean20 = strTrieMap16.validate();
        boolean boolean22 = strTrieMap16.contains("");
        java.io.Serializable serializable24 = strTrieMap16.get("");
        int int25 = strTrieMap16.size();
        boolean boolean26 = strTrieMap16.validate();
        java.lang.Class<?> wildcardClass27 = strTrieMap16.getClass();
        java.io.Serializable serializable28 = strTrieMap0.put("\u2514\u2500\u2500 null\n", (java.io.Serializable) wildcardClass27);
        boolean boolean29 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = strTrieMap0.toString();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable13 = strTrieMap0.put("hi!", (java.io.Serializable) "");
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.get("");
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean6 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (byte) 0);
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable17 = strTrieMap0.remove("");
        boolean boolean18 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean14 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        int int7 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap10 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable12 = strTrieMap10.get("");
        boolean boolean13 = strTrieMap10.validate();
        boolean boolean14 = strTrieMap10.validate();
        boolean boolean16 = strTrieMap10.contains("");
        java.io.Serializable serializable18 = strTrieMap10.get("");
        int int19 = strTrieMap10.size();
        strTrieMap10.clear();
        java.lang.Class<?> wildcardClass21 = strTrieMap10.getClass();
        java.io.Serializable serializable22 = strTrieMap0.put("\u2514\u2500\u2500 null\n", (java.io.Serializable) wildcardClass21);
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strTrieMap0.toString();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        int int8 = strTrieMap0.size();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        boolean boolean12 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        int int12 = strTrieMap0.size();
        java.io.Serializable serializable14 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 'a');
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean19 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int11 = strTrieMap0.size();
        int int12 = strTrieMap0.size();
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.validate();
        java.io.Serializable serializable14 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        java.io.Serializable serializable17 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("hi!");
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int13 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable8 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable15 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        boolean boolean18 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean14 = strTrieMap0.validate();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable9 = strTrieMap0.put("\u2514\u2500\u2500 null\n", (java.io.Serializable) (short) 100);
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        boolean boolean14 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 'a');
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean19 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int13 = strTrieMap0.size();
        boolean boolean14 = strTrieMap0.validate();
        int int15 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.util.Map<java.lang.String, java.io.Serializable> strMap1 = strTrieMap0.toMap();
        boolean boolean2 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        boolean boolean19 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        int int6 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        boolean boolean13 = strTrieMap0.contains("hi!");
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean16 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean18 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        boolean boolean17 = strTrieMap0.validate();
        boolean boolean18 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        java.io.Serializable serializable14 = strTrieMap0.remove("");
        boolean boolean15 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable16 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) 10.0f);
        boolean boolean18 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable21 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable23 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strTrieMap0.toString();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean14 = strTrieMap0.validate();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int11 = strTrieMap0.size();
        int int12 = strTrieMap0.size();
        boolean boolean13 = strTrieMap0.validate();
        int int14 = strTrieMap0.size();
        boolean boolean15 = strTrieMap0.validate();
        int int16 = strTrieMap0.size();
        boolean boolean18 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("");
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable20 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        boolean boolean22 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable25 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = strTrieMap0.toString();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.contains("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean12 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n", (java.io.Serializable) 0.0d);
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        strTrieMap0.clear();
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable15 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        int int12 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.io.Serializable serializable8 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) true);
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        strTrieMap0.clear();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        java.io.Serializable serializable14 = strTrieMap0.remove("hi!");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable19 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean20 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable18 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap15 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable17 = strTrieMap15.get("hi!");
        strTrieMap15.clear();
        boolean boolean20 = strTrieMap15.contains("");
        boolean boolean22 = strTrieMap15.contains("hi!");
        int int23 = strTrieMap15.size();
        boolean boolean25 = strTrieMap15.contains("hi!");
        strTrieMap15.clear();
        boolean boolean28 = strTrieMap15.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable30 = strTrieMap15.remove("\u2514\u2500\u2500 null\n");
        boolean boolean31 = strTrieMap15.validate();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap33 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable35 = strTrieMap33.get("");
        java.io.Serializable serializable37 = strTrieMap33.get("hi!");
        strTrieMap33.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap39 = strTrieMap33.toMap();
        strTrieMap33.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap41 = strTrieMap33.toMap();
        boolean boolean42 = strTrieMap33.validate();
        boolean boolean44 = strTrieMap33.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable47 = strTrieMap33.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap48 = strTrieMap33.toMap();
        java.lang.String str49 = strTrieMap33.toString();
        java.util.Map<java.lang.String, java.io.Serializable> strMap50 = strTrieMap33.toMap();
        int int51 = strTrieMap33.size();
        int int52 = strTrieMap33.size();
        java.lang.Class<?> wildcardClass53 = strTrieMap33.getClass();
        java.io.Serializable serializable54 = strTrieMap15.put("\u2514\u2500\u2500 null\n", (java.io.Serializable) wildcardClass53);
        java.io.Serializable serializable55 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n", (java.io.Serializable) "\u2514\u2500\u2500 null\n");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap57 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable59 = strTrieMap57.get("");
        java.io.Serializable serializable61 = strTrieMap57.get("hi!");
        strTrieMap57.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap63 = strTrieMap57.toMap();
        java.lang.Class<?> wildcardClass64 = strMap63.getClass();
        java.io.Serializable serializable65 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n", (java.io.Serializable) wildcardClass64);
        java.io.Serializable serializable67 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        java.io.Serializable serializable69 = strTrieMap0.remove("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strMap13 and strMap63.", strMap13.equals(strMap63) == strMap63.equals(strMap13));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        int int5 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        boolean boolean8 = strTrieMap0.contains("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.get("");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean17 = strTrieMap0.validate();
        int int18 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (byte) 0);
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable17 = strTrieMap0.remove("");
        strTrieMap0.clear();
        boolean boolean19 = strTrieMap0.validate();
        java.io.Serializable serializable21 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap22 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strTrieMap0.toString();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean18 = strTrieMap0.contains("hi!");
        int int19 = strTrieMap0.size();
        int int20 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean23 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int24 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strTrieMap0.toString();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable16 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) 10.0f);
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap18 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable20 = strTrieMap18.get("");
        boolean boolean21 = strTrieMap18.validate();
        boolean boolean22 = strTrieMap18.validate();
        java.io.Serializable serializable24 = strTrieMap18.get("hi!");
        boolean boolean26 = strTrieMap18.contains("");
        java.lang.Class<?> wildcardClass27 = strTrieMap18.getClass();
        java.io.Serializable serializable28 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass27);
        java.io.Serializable serializable30 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        strTrieMap0.clear();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap33 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable35 = strTrieMap33.get("");
        boolean boolean36 = strTrieMap33.validate();
        boolean boolean37 = strTrieMap33.validate();
        boolean boolean39 = strTrieMap33.contains("");
        java.io.Serializable serializable41 = strTrieMap33.get("");
        int int42 = strTrieMap33.size();
        boolean boolean44 = strTrieMap33.contains("\u2514\u2500\u2500 null\n");
        strTrieMap33.clear();
        strTrieMap33.clear();
        boolean boolean47 = strTrieMap33.validate();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap49 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable51 = strTrieMap49.get("hi!");
        strTrieMap49.clear();
        boolean boolean54 = strTrieMap49.contains("");
        boolean boolean56 = strTrieMap49.contains("hi!");
        int int57 = strTrieMap49.size();
        boolean boolean59 = strTrieMap49.contains("\u2514\u2500\u2500 null\n");
        strTrieMap49.clear();
        java.lang.Class<?> wildcardClass61 = strTrieMap49.getClass();
        java.io.Serializable serializable62 = strTrieMap33.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) wildcardClass61);
        java.io.Serializable serializable63 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) "\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable65 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable68 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int69 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str70 = strTrieMap0.toString();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        int int12 = strTrieMap0.size();
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable14 = strTrieMap0.remove("hi!");
        boolean boolean15 = strTrieMap0.validate();
        int int16 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.get("");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean17 = strTrieMap0.validate();
        boolean boolean18 = strTrieMap0.validate();
        java.io.Serializable serializable20 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        int int10 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable14 = strTrieMap0.remove("");
        int int15 = strTrieMap0.size();
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean15 = strTrieMap0.validate();
        int int16 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        int int9 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.get("hi!");
        boolean boolean14 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        int int7 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable14 = strTrieMap0.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean18 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable21 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable13 = strTrieMap0.put("hi!", (java.io.Serializable) "");
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap18 = strTrieMap0.toMap();
        java.io.Serializable serializable20 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap9 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable11 = strTrieMap9.get("");
        boolean boolean13 = strTrieMap9.contains("hi!");
        java.io.Serializable serializable16 = strTrieMap9.put("hi!", (java.io.Serializable) 100);
        java.io.Serializable serializable18 = strTrieMap9.remove("hi!");
        java.lang.Class<?> wildcardClass19 = serializable18.getClass();
        java.io.Serializable serializable20 = strTrieMap0.put("hi!", serializable18);
        int int21 = strTrieMap0.size();
        boolean boolean22 = strTrieMap0.validate();
        java.io.Serializable serializable24 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable27 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = strTrieMap0.toString();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        boolean boolean12 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        strTrieMap0.clear();
        boolean boolean14 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean15 = strTrieMap0.validate();
        boolean boolean16 = strTrieMap0.validate();
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        boolean boolean20 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int21 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n", (java.io.Serializable) (short) 10);
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int11 = strTrieMap0.size();
        int int12 = strTrieMap0.size();
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean17 = strTrieMap0.validate();
        boolean boolean19 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        int int12 = strTrieMap0.size();
        boolean boolean13 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap4 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable6 = strTrieMap4.get("hi!");
        strTrieMap4.clear();
        boolean boolean9 = strTrieMap4.contains("");
        boolean boolean11 = strTrieMap4.contains("hi!");
        java.lang.Class<?> wildcardClass12 = strTrieMap4.getClass();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n", (java.io.Serializable) wildcardClass12);
        boolean boolean14 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap15 = strTrieMap0.toMap();
        strTrieMap0.clear();
        int int17 = strTrieMap0.size();
        int int18 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean8 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }
}

