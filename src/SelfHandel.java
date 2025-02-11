public class SelfHandel {
    /**
     * 自增
     */
    public static void main(String[] args) {
        int a =10;
        // 先赋值,再自增1
        int aPlus = a++;
        System.out.println(aPlus);
        System.out.println(a);


        int b =10;
        int bPlus = ++b;
        System.out.println(bPlus);
        System.out.println(b);
    }
}
