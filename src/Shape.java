public class Shape {
    int height=17;
    String color="green";
    int width=10;
}
class Test{
    public static void main(String[] args) {
        Shape circle=new Shape();
        System.out.println(circle.height+" "+ circle.width+" "+circle.color);
    }
}
