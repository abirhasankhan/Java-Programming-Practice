 class Problem {
    String s;
    static class Inner {
        void testMethod(Problem ob) {
            ob.s = "Set from Inner";
        }
    }
}
public class arr {
    public static void main(String[] args) {
        Problem.Inner ob = new Problem.Inner();
        Problem op = new Problem();
        ob.testMethod(op);
        System.out.println(op.s);
    }

}

