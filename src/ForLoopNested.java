public class ForLoopNested {
    public static void main(String[] args) {
        /*
        打印九九乘法表
         */
        //定义i代表行数,j代表列数
        for (int i =1;i<=9;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
