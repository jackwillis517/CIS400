import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MidtermTest {
    Midterm out = new Midterm();

    @Test
    public void sum_t1(){
        Node l1 = Node.build(new int[]{1, 2, 3});
        Node l2 = Node.build(new int[] {5});
        int result = out.sum(l1, l2);
        assertEquals(128, result);
    }
    @Test
    public void sum_t2(){
        Node l1 = Node.build(new int[]{1});
        Node l2 = Node.build(new int[] {5, 2, 4});
        int result = out.sum(l1, l2);
        assertEquals(525, result);
    }
    @Test
    public void sum_t3(){
        Node l1 = Node.build(new int[]{1, 2, 3, 4, 5, 6, 7});
        Node l2 = Node.build(new int[] {5, 2, 4});
        int result = out.sum(l1, l2);
        assertEquals(1235091, result);
    }
    @Test
    public void sum_t4(){
        Node l1 = Node.build(new int[]{1, 2, 3, 4});
        Node l2 = Node.build(new int[] {});
        int result = out.sum(l1, l2);
        assertEquals(1234, result);
    }
    @Test
    public void sum_t5(){
        Node l1 = null;
        Node l2 = Node.build(new int[] {});
        int result = out.sum(l1, l2);
        assertEquals(0, result);
    }

    @Test
    public void reconstitute_t1() {
        String[] words = {"what", "a", "day"};
        int[] positions = {1, 2, 3};
        String result = out.reconstitute(words, positions);
        assertEquals("what a day", result);
    }

    @Test
    public void reconstitute_t2() {
        String[] words = {"for", "coding", "skills", "interviews"};
        int[] positions = {2, 3, 1, 4};
        String result = out.reconstitute(words, positions);
        assertEquals("skills for coding interviews", result);
    }

    @Test
    public void reconstitute_t3() {
        String[] words = {"science", "and", "computer", "electrical", "engineering"};
        int[] positions = {5, 3, 4, 1, 2};
        String result = out.reconstitute(words, positions);
        assertEquals("electrical engineering and computer science", result);
    }

    @Test
    public void reconstitute_t4() {
        String[] words = {"science", "and", "computer", "electrical"};
        int[] positions = {5, 3, 4, 1, 2};
        String result = out.reconstitute(words, positions);
        assertEquals("", result);
    }

    @Test
    public void reconstitute_t5() {
        String[] words = {"science", "and", "computer", "electrical", "science"};
        int[] positions = {5, 3, 4, 1};
        String result = out.reconstitute(words, positions);
        assertEquals("", result);
    }

    @Test
    public void containsAllLetters_t1() {
        String s1 = "design patterns";
        String s2 = "adeginprst";
        assertTrue(out.containsAllLetters(s1, s2));
    }
    @Test
    public void containsAllLetters_t2() {
        String s1 = "design patterns";
        String s2 = "prstadeginprstadegin";
        assertTrue(out.containsAllLetters(s1, s2));
    }
    @Test
    public void containsAllLetters_t3() {
        String s1 = "design patterns";
        String s2 = "adegipr";
        assertFalse(out.containsAllLetters(s1, s2));
    }
    @Test
    public void containsAllLetters_t4() {
        String s1 = "design patterns";
        String s2 = "";
        assertTrue(out.containsAllLetters(s1, s2));
    }
    @Test
    public void containsAllLetters_t5() {
        String s1 = "";
        String s2 = "adegipr";
        assertFalse(out.containsAllLetters(s1, s2));
    }

}