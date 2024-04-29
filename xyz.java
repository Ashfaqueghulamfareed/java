package halo1;


abstract  class Halo1 {
public abstract void ent();
public abstract void disp();
}

public class xyz extends Halo1{
    public void ent(){
        System.out.println("hello my dear bro");
    }
    public void disp(){
        System.out.println("hiii2 big bro");
    }
    public static void main(String[] args) {
        Halo1 xyz = new xyz();
       
        xyz.ent();
         xyz.disp();
    }
    
}
