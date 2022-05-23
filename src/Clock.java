public class Clock {
    private int h,m,s;
    public void display(){
        System.out.println("当前时间为："+h+"时"+m+"分"+s+"秒");
    }
    public void check(){
        while(s>=60){
            s-=60;
            m++;
        }
        while(m>=60){
            m-=60;
            h++;
        }
        while(h>=24){
            h-=24;
        }
    }
    public void go(int n){
        s+=n;
        check();
    }
    public void go(int l,int n){
        s+=n;
        m+=l;
        check();
    }
    public Clock(){
        h=0;
        m=0;
        s=0;
    }
    public Clock(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    public static void main(String args[]){
        Clock c1=new Clock(10,20,30);
        Clock c2=new Clock(4,4,4);
        c1.display();
        c2.display();
    }
}
