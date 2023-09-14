package ConditionalStatement;

public class Ternary {
    public static void main(String[] args) {
        
        // int a = 50;
        // int b = 20;
        // String res = (a<b)?"a is less" : "b  is less";
        // System.out.println(res);

        int a = 30;
        int b = 20;
        int c = 40;
        int num = (a<b)? (a<c? a : b) : (b<c? b : c);
        System.out.println(num);

    }
}
