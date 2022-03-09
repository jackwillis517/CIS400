import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Feb15Test {
    Feb15 out = new Feb15();

    @Test
    public void t1() {
        String input = "kayak";
        assertTrue(out.couldBePalindrome(input));
    }
    @Test
    public void t2() {
        // input is "kayak" but with the letters reordered
        // should still return true
        String input = "kkaya";
        assertTrue(out.couldBePalindrome(input));
    }
    @Test
    public void t3() {
        // input is "kayaker", but reordered
        // should return false because of the added r
        String input = "aeakrky";
        assertFalse(out.couldBePalindrome(input));
    }
    @Test
    public void t4() {
        String input = "redder";
        assertTrue(out.couldBePalindrome(input));
    }
    @Test
    public void t5() {
        // input is "redder" but reordered
        // should still return true
        String input = "rreded";
        assertTrue(out.couldBePalindrome(input));
    }
    @Test
    public void t6() {
        // input is "redderabc" but reordered
        // should return false because of the added abc
        String input = "daedbrrce";
        assertFalse(out.couldBePalindrome(input));
    }
    @Test
    public void t7() {
        String input = "enough";
        assertFalse(out.couldBePalindrome(input));
    }
    @Test
    public void t8() {
        String input = "something";
        assertFalse(out.couldBePalindrome(input));
    }
    @Test
    public void t9() {
        String input = "completely";
        assertFalse(out.couldBePalindrome(input));
    }
    @Test
    public void t10() {
        String input = "different";
        assertFalse(out.couldBePalindrome(input));
    }
}