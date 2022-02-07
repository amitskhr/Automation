package Learn;

import static java.lang.System.*;

public class    J_learn {

    static int a;
    int d;

    public static void add(int b, int c) {
        a = b + c;
        System.out.println(a);
    }
    public void methodPublic() {

        System.out.println("Im im public method.");
    }
    protected void methodProtected() {

        System.out.println("Im in Protected method.");
    }
    private void methodPrivate(int a, int b) {
        d=a-b;
        System.out.println(d);
        System.out.println("Im in Private method.");
    }
    public  void subStr(){
        methodPrivate(14,12);
    }

    static public void main(String args[]) {
        J_learn obj = new J_learn();
        obj.methodPublic();
        obj.methodProtected();



    }


}
