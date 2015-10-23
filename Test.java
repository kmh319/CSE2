
public class Test {
      public static int addAll() {
    int i =1;
    int j = 0;
    while(i <10){
     j = j +i;
     if(i == 5){
       return j;
     }
     i++;
    }
    return i + j;
  }
  public static void main(String args[]) {
    System.out.println(addAll());
  }

}