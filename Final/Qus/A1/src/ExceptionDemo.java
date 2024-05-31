public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
          int sum = a/b;
            System.out.println("Result: "+sum);
        }catch (Exception e){
            System.out.println("Exception: "+e);
        }
        finally {
            System.out.println("this code");
        }
    }
}
