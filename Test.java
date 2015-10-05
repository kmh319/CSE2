
public class Test {
       public static void main(String[] args){
              int i=0;
                     while (true){
                            i++;
                            if (i%50==0){
                                    for (int t=0;t<100;t++){
                                          if (t % 10 ==0){
                                                 System.out.println(t);
                                                 break;
                                          }
                                   }
                                   System.out.println(i);
                                   break;
                            }
                     i++;
                     }
       }
}