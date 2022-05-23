public class Student {
    private int Sno;
    private int Cno;
    private String name;
    private String sex;
    private int age;
    public static int count=0;
    public Student(){
        count++;
        Sno=0;
        Cno=0;
        name=" ";
        sex=" ";
        age=0;
    }
    public int getSno() {
        return Sno;
    }

    public int getCno() {
        return Cno;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
    public void setSno(int sno) {
        Sno = sno;
    }

    public void setCno(int cno) {
        Cno = cno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "该学生的学号为："+Sno+"班号为："+Cno+"姓名为："+name+"性别为"+sex+"年龄为："+age;
    }
    public int getCount(){
        return count;
    }
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.setName("张三");
        s1.setAge(18);
        s2.setName("李四");
        s2.setAge(25);
        if(s1.getAge()> s2.getAge()){
            System.out.println(s1);
        }else{
            System.out.println(s2);
        }
        System.out.println(s1.getCount());
    }
}
