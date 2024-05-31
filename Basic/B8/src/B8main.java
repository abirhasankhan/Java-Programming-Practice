public class B8main {
    public static void main(String[] args) {
        B8 box1;
        B8 box2;

        //part 1
        box1 = new B8(8,9,6);
        System.out.println(box1);
        box2 = box1;
        System.out.println(box2);

        //part 2
        box1 = new B8(11,193,12);
        System.out.println(box1);
        box2 = box1;
        System.out.println(box1);
        System.out.println(box2);
    }
}
