import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence> charSequenceSuffixTrie1 = new com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence>((java.lang.CharSequence) "");
        boolean boolean3 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<java.lang.String> strSet4 = charSequenceSuffixTrie1.getSuffixes();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence> charSequenceSuffixTrie1 = new com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence>((java.lang.CharSequence) "");
        boolean boolean3 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "\u2514\u2500\u2500 \000\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 i\n\u2502\u2514\u2500\u2500 (!) hi!\n\u251c\u2500\u2500 i\n\u2502\u2514\u2500\u2500 (!) i!\n\u2514\u2500\u2500 (!) !\n");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence> charSequenceSuffixTrie1 = new com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence>((java.lang.CharSequence) "");
        boolean boolean3 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "");
        java.lang.String str4 = charSequenceSuffixTrie1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "hi!");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence> charSequenceSuffixTrie1 = new com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence>((java.lang.CharSequence) "");
        boolean boolean3 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "");
        java.lang.String str4 = charSequenceSuffixTrie1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "\u2514\u2500\u2500 \000\n\u251c\u2500\u2500 h\n\u2502\u2514\u2500\u2500 i\n\u2502\u2514\u2500\u2500 (!) hi!\n\u251c\u2500\u2500 i\n\u2502\u2514\u2500\u2500 (!) i!\n\u2514\u2500\u2500 (!) !\n");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence> charSequenceSuffixTrie1 = new com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence>((java.lang.CharSequence) "");
        boolean boolean3 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "");
        java.lang.String str4 = charSequenceSuffixTrie1.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<java.lang.String> strSet5 = charSequenceSuffixTrie1.getSuffixes();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence> charSequenceSuffixTrie1 = new com.jwetherell.algorithms.data_structures.SuffixTrie<java.lang.CharSequence>((java.lang.CharSequence) "");
        boolean boolean3 = charSequenceSuffixTrie1.doesSubStringExist((java.lang.CharSequence) "");
        java.lang.String str4 = charSequenceSuffixTrie1.toString();
        java.lang.String str5 = charSequenceSuffixTrie1.toString();
        boolean boolean7 = charSequenceSuffixTrie1.add((java.lang.CharSequence) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<java.lang.String> strSet8 = charSequenceSuffixTrie1.getSuffixes();
    }
}

