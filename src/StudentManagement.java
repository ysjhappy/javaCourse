public class StudentManagement {
    public static void main(String[] args) {
        System.out.println("添加的学员信息:");
        addStudent(1001,"张三","男");
        addStudent(1002,"莉丝","女");
        addStudent(1003,"王武","男");
    }
    public static Student addStudent(int id,String name,String sex){
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        System.out.println("学号:"+student.getId()+",姓名:"+student.getName()
                +",性别:"+student.getSex()+".");
        return student;
    }
}
