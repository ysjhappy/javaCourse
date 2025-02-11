public class IfElseIf {
    public static void main(String[] args) {
        int num = 81;
        if (num>=80){
            System.out.println("优秀");
        } else if (num>=60) {
            System.out.println("良好");
        }else {
            System.out.println("不及格");
        }

        // 三元运算
        System.out.println(num>=60?"良好":"加油");
    }
}
