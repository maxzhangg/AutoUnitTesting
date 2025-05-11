import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        boolean boolean9 = strTrieMap0.contains("hi!");
        boolean boolean10 = strTrieMap0.validate();
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
        int int12 = strTrieMap0.size();
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        strTrieMap0.clear();
        int int8 = strTrieMap0.size();
        int int9 = strTrieMap0.size();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        int int14 = strTrieMap0.size();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap17 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean9 = strTrieMap0.contains("hi!");
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        java.io.Serializable serializable19 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        strTrieMap0.clear();
        int int8 = strTrieMap0.size();
        int int9 = strTrieMap0.size();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        int int12 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        int int8 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        int int14 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        boolean boolean12 = strTrieMap0.validate();
        int int13 = strTrieMap0.size();
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable19 = strTrieMap0.remove("");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        java.lang.String str8 = strTrieMap0.toString();
        java.lang.String str9 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        boolean boolean13 = strTrieMap0.validate();
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean15 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap4 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        java.io.Serializable serializable10 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        boolean boolean17 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        java.util.Map<java.lang.String, java.io.Serializable> strMap17 = strTrieMap0.toMap();
        java.io.Serializable serializable19 = strTrieMap0.remove("");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap21 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable23 = strTrieMap21.get("");
        java.io.Serializable serializable25 = strTrieMap21.get("hi!");
        strTrieMap21.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap27 = strTrieMap21.toMap();
        strTrieMap21.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap29 = strTrieMap21.toMap();
        boolean boolean30 = strTrieMap21.validate();
        boolean boolean32 = strTrieMap21.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable35 = strTrieMap21.put("hi!", (java.io.Serializable) 10L);
        java.util.Map<java.lang.String, java.io.Serializable> strMap36 = strTrieMap21.toMap();
        java.lang.String str37 = strTrieMap21.toString();
        java.util.Map<java.lang.String, java.io.Serializable> strMap38 = strTrieMap21.toMap();
        int int39 = strTrieMap21.size();
        int int40 = strTrieMap21.size();
        java.lang.String str41 = strTrieMap21.toString();
        java.io.Serializable serializable44 = strTrieMap21.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n", (java.io.Serializable) (short) 1);
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap46 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable48 = strTrieMap46.get("");
        boolean boolean50 = strTrieMap46.contains("hi!");
        java.io.Serializable serializable53 = strTrieMap46.put("hi!", (java.io.Serializable) 100);
        boolean boolean55 = strTrieMap46.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap56 = strTrieMap46.toMap();
        java.lang.String str57 = strTrieMap46.toString();
        java.util.Map<java.lang.String, java.io.Serializable> strMap58 = strTrieMap46.toMap();
        java.io.Serializable serializable60 = strTrieMap46.remove("hi!");
        boolean boolean61 = strTrieMap46.validate();
        java.io.Serializable serializable63 = strTrieMap46.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.lang.Class<?> wildcardClass64 = strTrieMap46.getClass();
        java.io.Serializable serializable65 = strTrieMap21.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n", (java.io.Serializable) wildcardClass64);
        java.io.Serializable serializable66 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) wildcardClass64);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strMap17 and strMap56.", strMap17.equals(strMap56) == strMap56.equals(strMap17));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.io.Serializable serializable18 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        strTrieMap0.clear();
        int int12 = strTrieMap0.size();
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strTrieMap0.toString();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        java.util.Map<java.lang.String, java.io.Serializable> strMap35 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = strTrieMap0.toString();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        strTrieMap0.clear();
        int int8 = strTrieMap0.size();
        strTrieMap0.clear();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.get("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap15 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable17 = strTrieMap15.get("");
        java.io.Serializable serializable19 = strTrieMap15.get("hi!");
        strTrieMap15.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap21 = strTrieMap15.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap22 = strTrieMap15.toMap();
        strTrieMap15.clear();
        java.io.Serializable serializable26 = strTrieMap15.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable28 = strTrieMap15.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable30 = strTrieMap15.get("");
        boolean boolean31 = strTrieMap15.validate();
        java.lang.Class<?> wildcardClass32 = strTrieMap15.getClass();
        java.io.Serializable serializable33 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass32);
        boolean boolean34 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap35 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str37 = strTrieMap0.toString();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        boolean boolean12 = strTrieMap0.validate();
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("");
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.validate();
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
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
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        boolean boolean17 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        int int12 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 0);
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean13 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.io.Serializable serializable6 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        int int7 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
        boolean boolean21 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean9 = strTrieMap0.contains("");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean15 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        boolean boolean9 = strTrieMap0.validate();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean14 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean14 = strTrieMap0.validate();
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable18 = strTrieMap0.get("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap20 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable22 = strTrieMap20.get("");
        boolean boolean23 = strTrieMap20.validate();
        boolean boolean24 = strTrieMap20.validate();
        boolean boolean26 = strTrieMap20.contains("");
        java.io.Serializable serializable28 = strTrieMap20.get("");
        int int29 = strTrieMap20.size();
        strTrieMap20.clear();
        java.lang.Class<?> wildcardClass31 = strTrieMap20.getClass();
        java.io.Serializable serializable32 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass31);
        java.util.Map<java.lang.String, java.io.Serializable> strMap33 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = strTrieMap0.toString();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        java.lang.String str10 = strTrieMap0.toString();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean14 = strTrieMap0.validate();
        boolean boolean15 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        strTrieMap0.clear();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        strTrieMap0.clear();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        boolean boolean16 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        boolean boolean12 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean14 = strTrieMap0.validate();
        int int15 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
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
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap16 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable18 = strTrieMap16.get("");
        java.io.Serializable serializable20 = strTrieMap16.remove("");
        boolean boolean22 = strTrieMap16.contains("hi!");
        boolean boolean24 = strTrieMap16.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.lang.Class<?> wildcardClass25 = strTrieMap16.getClass();
        java.io.Serializable serializable26 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) wildcardClass25);
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap28 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable30 = strTrieMap28.get("");
        java.io.Serializable serializable32 = strTrieMap28.get("hi!");
        java.io.Serializable serializable35 = strTrieMap28.put("hi!", (java.io.Serializable) true);
        strTrieMap28.clear();
        int int37 = strTrieMap28.size();
        int int38 = strTrieMap28.size();
        java.io.Serializable serializable40 = strTrieMap28.get("hi!");
        int int41 = strTrieMap28.size();
        int int42 = strTrieMap28.size();
        java.lang.Class<?> wildcardClass43 = strTrieMap28.getClass();
        java.io.Serializable serializable44 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n", (java.io.Serializable) wildcardClass43);
        java.io.Serializable serializable46 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        boolean boolean47 = strTrieMap0.validate();
        java.io.Serializable serializable49 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str51 = strTrieMap0.toString();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
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
        strTrieMap0.clear();
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        int int18 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
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
        boolean boolean17 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        java.io.Serializable serializable9 = strTrieMap0.get("hi!");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.validate();
        boolean boolean14 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
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
        int int18 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean12 = strTrieMap0.contains("");
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int17 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean19 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        java.io.Serializable serializable7 = strTrieMap0.get("");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable11 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable13 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
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
        int int17 = strTrieMap0.size();
        int int18 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        boolean boolean8 = strTrieMap0.contains("hi!");
        int int9 = strTrieMap0.size();
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.io.Serializable serializable8 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) true);
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean14 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
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
        strTrieMap0.clear();
        int int17 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap18 = strTrieMap0.toMap();
        int int19 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        boolean boolean12 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        boolean boolean16 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        int int4 = strTrieMap0.size();
        boolean boolean5 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        int int8 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        strTrieMap0.clear();
        java.io.Serializable serializable12 = strTrieMap0.remove("");
        int int13 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap14 = strTrieMap0.toMap();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        strTrieMap0.clear();
        int int13 = strTrieMap0.size();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
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
        int int17 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("");
        boolean boolean10 = strTrieMap0.validate();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap6 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable8 = strTrieMap6.get("hi!");
        java.io.Serializable serializable10 = strTrieMap6.get("");
        java.lang.Class<?> wildcardClass11 = strTrieMap6.getClass();
        java.io.Serializable serializable12 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass11);
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        boolean boolean16 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        int int17 = strTrieMap0.size();
        strTrieMap0.clear();
        int int19 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        int int10 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        int int12 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        int int6 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = strTrieMap0.toString();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.util.Map<java.lang.String, java.io.Serializable> strMap1 = strTrieMap0.toMap();
        java.io.Serializable serializable3 = strTrieMap0.remove("");
        java.io.Serializable serializable5 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        strTrieMap0.clear();
        boolean boolean7 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        int int9 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (byte) 0);
        java.io.Serializable serializable15 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        strTrieMap0.clear();
        int int17 = strTrieMap0.size();
        boolean boolean18 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap19 = strTrieMap0.toMap();
        strTrieMap0.clear();
        boolean boolean22 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = strTrieMap0.toString();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
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
        int int16 = strTrieMap0.size();
        java.io.Serializable serializable18 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        java.io.Serializable serializable20 = strTrieMap0.remove("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        int int5 = strTrieMap0.size();
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        int int8 = strTrieMap0.size();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        int int11 = strTrieMap0.size();
        java.io.Serializable serializable13 = strTrieMap0.get("");
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        boolean boolean16 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.contains("");
        boolean boolean13 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.validate();
        strTrieMap0.clear();
        strTrieMap0.clear();
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
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
        boolean boolean19 = strTrieMap0.validate();
        int int20 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap21 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        int int6 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap8 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.remove("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap12 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable14 = strTrieMap12.get("");
        java.io.Serializable serializable16 = strTrieMap12.get("hi!");
        strTrieMap12.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap18 = strTrieMap12.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap19 = strTrieMap12.toMap();
        strTrieMap12.clear();
        java.io.Serializable serializable23 = strTrieMap12.put("hi!", (java.io.Serializable) 1.0f);
        java.io.Serializable serializable25 = strTrieMap12.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap12.clear();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap28 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable30 = strTrieMap28.get("hi!");
        strTrieMap28.clear();
        java.io.Serializable serializable33 = strTrieMap28.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap34 = strTrieMap28.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap35 = strTrieMap28.toMap();
        java.lang.Class<?> wildcardClass36 = strTrieMap28.getClass();
        java.io.Serializable serializable37 = strTrieMap12.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) wildcardClass36);
        java.io.Serializable serializable38 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n", serializable37);
        java.util.Map<java.lang.String, java.io.Serializable> strMap39 = strTrieMap0.toMap();
        java.io.Serializable serializable41 = strTrieMap0.remove("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strMap6 and strMap34.", strMap6.equals(strMap34) == strMap34.equals(strMap6));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        int int4 = strTrieMap0.size();
        boolean boolean5 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = strTrieMap0.toString();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("hi!");
        int int13 = strTrieMap0.size();
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        boolean boolean16 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap11 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable13 = strTrieMap11.get("");
        java.io.Serializable serializable15 = strTrieMap11.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap11.toMap();
        boolean boolean18 = strTrieMap11.contains("\u2514\u2500\u2500 null\n");
        java.lang.Class<?> wildcardClass19 = strTrieMap11.getClass();
        java.io.Serializable serializable20 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass19);
        java.io.Serializable serializable22 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        boolean boolean23 = strTrieMap0.validate();
        boolean boolean24 = strTrieMap0.validate();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap26 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable28 = strTrieMap26.get("");
        java.io.Serializable serializable30 = strTrieMap26.get("hi!");
        java.io.Serializable serializable33 = strTrieMap26.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable35 = strTrieMap26.get("");
        java.io.Serializable serializable37 = strTrieMap26.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap38 = strTrieMap26.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap39 = strTrieMap26.toMap();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap41 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable43 = strTrieMap41.get("");
        java.io.Serializable serializable45 = strTrieMap41.get("hi!");
        java.io.Serializable serializable48 = strTrieMap41.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable50 = strTrieMap41.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.lang.String str51 = strTrieMap41.toString();
        boolean boolean53 = strTrieMap41.contains("hi!");
        int int54 = strTrieMap41.size();
        int int55 = strTrieMap41.size();
        java.lang.String str56 = strTrieMap41.toString();
        int int57 = strTrieMap41.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap58 = strTrieMap41.toMap();
        java.lang.Class<?> wildcardClass59 = strTrieMap41.getClass();
        java.io.Serializable serializable60 = strTrieMap26.put("hi!", (java.io.Serializable) wildcardClass59);
        java.io.Serializable serializable61 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n", (java.io.Serializable) wildcardClass59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strMap16 and strMap38.", strMap16.equals(strMap38) == strMap38.equals(strMap16));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable7 = strTrieMap0.get("hi!");
        boolean boolean9 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean15 = strTrieMap0.contains("");
        boolean boolean16 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap17 = strTrieMap0.toMap();
        boolean boolean18 = strTrieMap0.validate();
        java.io.Serializable serializable20 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        boolean boolean13 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean12 = strTrieMap0.validate();
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("hi!");
        boolean boolean8 = strTrieMap0.contains("");
        int int9 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        boolean boolean14 = strTrieMap0.validate();
        java.io.Serializable serializable16 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
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
        strTrieMap0.clear();
        int int17 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        int int6 = strTrieMap0.size();
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        boolean boolean10 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable12 = strTrieMap0.get("");
        java.io.Serializable serializable14 = strTrieMap0.get("");
        int int15 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        boolean boolean9 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
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
        int int18 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        strTrieMap0.clear();
        int int9 = strTrieMap0.size();
        int int10 = strTrieMap0.size();
        java.io.Serializable serializable12 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap13 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        java.io.Serializable serializable6 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean8 = strTrieMap0.validate();
        boolean boolean9 = strTrieMap0.validate();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
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
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap24 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str25 = strTrieMap0.toString();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        int int8 = strTrieMap0.size();
        int int9 = strTrieMap0.size();
        java.io.Serializable serializable11 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable15 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        java.io.Serializable serializable7 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        int int5 = strTrieMap0.size();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap7 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable9 = strTrieMap7.get("");
        java.io.Serializable serializable11 = strTrieMap7.remove("");
        boolean boolean12 = strTrieMap7.validate();
        int int13 = strTrieMap7.size();
        java.io.Serializable serializable15 = strTrieMap7.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap7.toMap();
        boolean boolean17 = strTrieMap7.validate();
        java.io.Serializable serializable20 = strTrieMap7.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) 1.0f);
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap22 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable24 = strTrieMap22.get("hi!");
        strTrieMap22.clear();
        java.io.Serializable serializable27 = strTrieMap22.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap28 = strTrieMap22.toMap();
        java.io.Serializable serializable30 = strTrieMap22.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap31 = strTrieMap22.toMap();
        java.lang.Class<?> wildcardClass32 = strMap31.getClass();
        java.io.Serializable serializable33 = strTrieMap7.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n", (java.io.Serializable) wildcardClass32);
        java.io.Serializable serializable34 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n", (java.io.Serializable) "\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap35 = strTrieMap0.toMap();
        int int36 = strTrieMap0.size();
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap38 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable40 = strTrieMap38.get("");
        boolean boolean41 = strTrieMap38.validate();
        boolean boolean42 = strTrieMap38.validate();
        boolean boolean44 = strTrieMap38.contains("");
        java.io.Serializable serializable46 = strTrieMap38.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap47 = strTrieMap38.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap48 = strTrieMap38.toMap();
        boolean boolean49 = strTrieMap38.validate();
        boolean boolean51 = strTrieMap38.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {4}\n");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap53 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable55 = strTrieMap53.get("");
        java.io.Serializable serializable57 = strTrieMap53.get("hi!");
        java.io.Serializable serializable59 = strTrieMap53.remove("");
        java.io.Serializable serializable62 = strTrieMap53.put("hi!", (java.io.Serializable) (byte) 10);
        java.io.Serializable serializable64 = strTrieMap53.remove("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap65 = strTrieMap53.toMap();
        java.lang.Class<?> wildcardClass66 = strTrieMap53.getClass();
        java.io.Serializable serializable67 = strTrieMap38.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {0.0}\n", (java.io.Serializable) wildcardClass66);
        java.io.Serializable serializable68 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n", serializable67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on strMap28 and strMap65.", strMap28.equals(strMap65) == strMap65.equals(strMap28));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        int int8 = strTrieMap0.size();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.io.Serializable serializable14 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        int int10 = strTrieMap0.size();
        boolean boolean11 = strTrieMap0.validate();
        boolean boolean13 = strTrieMap0.contains("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        java.io.Serializable serializable9 = strTrieMap0.put("\u2514\u2500\u2500 null\n", (java.io.Serializable) (short) 100);
        java.io.Serializable serializable11 = strTrieMap0.remove("");
        java.io.Serializable serializable14 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (short) 0);
        boolean boolean16 = strTrieMap0.contains("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable19 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        boolean boolean6 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        strTrieMap0.clear();
        boolean boolean8 = strTrieMap0.validate();
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = strTrieMap0.toString();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
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
        int int15 = strTrieMap0.size();
        java.io.Serializable serializable17 = strTrieMap0.get("");
        java.io.Serializable serializable19 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
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
        java.util.Map<java.lang.String, java.io.Serializable> strMap16 = strTrieMap0.toMap();
        boolean boolean17 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        strTrieMap0.clear();
        java.io.Serializable serializable13 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n", (java.io.Serializable) 'a');
        boolean boolean15 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        java.io.Serializable serializable18 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) "\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap19 = strTrieMap0.toMap();
        java.io.Serializable serializable22 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n", (java.io.Serializable) 100L);
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strTrieMap0.toString();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable8 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        boolean boolean7 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable9 = strTrieMap0.get("");
        java.io.Serializable serializable11 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
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
        int int17 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap5 = strTrieMap0.toMap();
        boolean boolean6 = strTrieMap0.validate();
        strTrieMap0.clear();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean4 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) 100);
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap9 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.lang.Class<?> wildcardClass10 = strTrieMap9.getClass();
        java.io.Serializable serializable11 = strTrieMap0.put("hi!", (java.io.Serializable) wildcardClass10);
        boolean boolean13 = strTrieMap0.contains("hi!");
        int int14 = strTrieMap0.size();
        java.io.Serializable serializable16 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        java.io.Serializable serializable18 = strTrieMap0.remove("");
        java.lang.String str19 = strTrieMap0.toString();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean5 = strTrieMap0.contains("hi!");
        boolean boolean7 = strTrieMap0.contains("");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable13 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
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
        java.io.Serializable serializable18 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {0}\n");
        java.io.Serializable serializable20 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
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
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = strTrieMap0.toString();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
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
        int int15 = strTrieMap0.size();
        java.io.Serializable serializable17 = strTrieMap0.get("");
        strTrieMap0.clear();
        boolean boolean20 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {1.0}\n");
        boolean boolean21 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = strTrieMap0.toString();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        boolean boolean6 = strTrieMap0.contains("");
        java.io.Serializable serializable8 = strTrieMap0.get("");
        int int9 = strTrieMap0.size();
        boolean boolean10 = strTrieMap0.validate();
        boolean boolean12 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable14 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("");
        boolean boolean6 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.validate();
        java.io.Serializable serializable9 = strTrieMap0.remove("hi!");
        int int10 = strTrieMap0.size();
        int int11 = strTrieMap0.size();
        int int12 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
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
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        java.io.Serializable serializable19 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        int int11 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
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
        java.io.Serializable serializable39 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str42 = strTrieMap0.toString();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        boolean boolean5 = strTrieMap0.contains("");
        boolean boolean7 = strTrieMap0.contains("hi!");
        boolean boolean8 = strTrieMap0.validate();
        java.io.Serializable serializable10 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {1}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = strTrieMap0.toString();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
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
        boolean boolean16 = strTrieMap0.validate();
        java.io.Serializable serializable18 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        strTrieMap0.clear();
        boolean boolean21 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable23 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strTrieMap0.toString();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
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
        java.io.Serializable serializable20 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = strTrieMap0.toString();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.remove("");
        boolean boolean5 = strTrieMap0.validate();
        boolean boolean7 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.io.Serializable serializable9 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {100}\n");
        java.io.Serializable serializable11 = strTrieMap0.get("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable13 = strTrieMap0.remove("");
        java.io.Serializable serializable15 = strTrieMap0.get("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = strTrieMap0.toString();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.remove("");
        boolean boolean3 = strTrieMap0.validate();
        java.io.Serializable serializable5 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable8 = strTrieMap0.put("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n", (java.io.Serializable) (byte) 1);
        strTrieMap0.clear();
        boolean boolean11 = strTrieMap0.contains("\u2514\u2500\u2500 null\n");
        java.util.Map<java.lang.String, java.io.Serializable> strMap12 = strTrieMap0.toMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        int int5 = strTrieMap0.size();
        java.io.Serializable serializable7 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        strTrieMap0.clear();
        int int6 = strTrieMap0.size();
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = strTrieMap0.toString();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
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
        int int22 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = strTrieMap0.toString();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        java.io.Serializable serializable6 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = strTrieMap0.toString();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        boolean boolean3 = strTrieMap0.validate();
        boolean boolean4 = strTrieMap0.validate();
        java.io.Serializable serializable6 = strTrieMap0.get("");
        java.util.Map<java.lang.String, java.io.Serializable> strMap7 = strTrieMap0.toMap();
        boolean boolean9 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        int int10 = strTrieMap0.size();
        java.util.Map<java.lang.String, java.io.Serializable> strMap11 = strTrieMap0.toMap();
        boolean boolean12 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable7 = strTrieMap0.put("hi!", (java.io.Serializable) true);
        java.io.Serializable serializable9 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        java.lang.String str10 = strTrieMap0.toString();
        boolean boolean12 = strTrieMap0.contains("hi!");
        int int13 = strTrieMap0.size();
        int int14 = strTrieMap0.size();
        strTrieMap0.clear();
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.io.Serializable serializable10 = strTrieMap0.remove("\u2514\u2500\u2500 null\n");
        java.io.Serializable serializable12 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n");
        int int13 = strTrieMap0.size();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = strTrieMap0.toString();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        boolean boolean1 = strTrieMap0.validate();
        java.util.Map<java.lang.String, java.io.Serializable> strMap2 = strTrieMap0.toMap();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = strTrieMap0.toString();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("");
        java.io.Serializable serializable4 = strTrieMap0.get("hi!");
        java.io.Serializable serializable6 = strTrieMap0.remove("");
        boolean boolean8 = strTrieMap0.contains("\u2514\u2500\u2500 null\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 hi\n\u2502\u2514\u2500\u2500 (!) hi! = {100}\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {10}\n}\n");
        boolean boolean9 = strTrieMap0.validate();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = strTrieMap0.toString();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
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
        java.io.Serializable serializable17 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {}\n");
        java.io.Serializable serializable19 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        strTrieMap0.clear();
        java.io.Serializable serializable5 = strTrieMap0.get("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap6 = strTrieMap0.toMap();
        boolean boolean8 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap9 = strTrieMap0.toMap();
        boolean boolean10 = strTrieMap0.validate();
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {true}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
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
        boolean boolean16 = strTrieMap0.validate();
        java.io.Serializable serializable18 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {null}\n");
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = strTrieMap0.toString();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
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
        java.io.Serializable serializable18 = strTrieMap0.remove("\u2514\u2500\u2500 null\n\u2514\u2500\u2500 h\n\u2514\u2500\u2500 hi\n\u2514\u2500\u2500 (!) hi! = {100}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = strTrieMap0.toString();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable> strTrieMap0 = new com.jwetherell.algorithms.data_structures.TrieMap<java.lang.String, java.io.Serializable>();
        java.io.Serializable serializable2 = strTrieMap0.get("hi!");
        java.io.Serializable serializable4 = strTrieMap0.get("");
        strTrieMap0.clear();
        java.io.Serializable serializable7 = strTrieMap0.get("hi!");
        boolean boolean9 = strTrieMap0.contains("hi!");
        java.util.Map<java.lang.String, java.io.Serializable> strMap10 = strTrieMap0.toMap();
        java.io.Serializable serializable12 = strTrieMap0.get("\u2514\u2500\u2500 null\n\u2514\u2500\u2500\u2514\n\u2514\u2500\u2500\u2514\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500\n\u2514\u2500\u2500\u2514\u2500\u2500 \n\u2514\u2500\u2500\u2514\u2500\u2500 n\n\u2514\u2500\u2500\u2514\u2500\u2500 nu\n\u2514\u2500\u2500\u2514\u2500\u2500 nul\n\u2514\u2500\u2500\u2514\u2500\u2500 null\n\u2514\u2500\u2500 (\n\u2514\u2500\u2500 null\n = {class com.jwetherell.algorithms.data_structures.TrieMap}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = strTrieMap0.toString();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = strTrieMap0.toString();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
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
        int int16 = strTrieMap0.size();
        strTrieMap0.clear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = strTrieMap0.toString();
    }
}

