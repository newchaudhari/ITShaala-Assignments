package __constructor_practice;

public class Demo2 {
  Demo2(){
      System.out.println("Zero para");
  }
  Demo2(int a){
      this(68,45);
      System.out.println("One para");
  }
  Demo2(int a, int b){
      this(89,4.6);
      System.out.println("two int para");
  }
  Demo2(int a,double b){
      this();
      System.out.println("two double para");
  }

    public static void main(String[] args) {
        Demo2 demo=new Demo2();
    }
}
