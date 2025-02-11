public class DataType {
    /**
     * 数据类型转换
     */
    public static void main(String[] args) {
        // 初始化变量
        double num1 = 3.1415;
        //大转小需要强制类型转换
        int num2 = (int)num1;
        System.out.println(num2);//出现精度损失
    }
}
