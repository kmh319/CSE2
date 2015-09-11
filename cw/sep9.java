public class sep9{
    //method 1
    //public static void main (String[] args){
      //  float width=5;
        //float height=5;
        //float area=width*height;
        //System.out.println("Area: "+area);
        
    }

    //method 2
   // public static void area(){
    //    float width=5;
      //  float height=5;
        //float area=width*height;
        //System.out.println("Area: "+area);
    //}
    //public static void main (String[] args){
      //  area();
        
    //}

    //method 3
    public static float area (float l,float w){
        float area=l*w;
        return area;
    }
    public static void main (String[] args){
        float length=5;
        float width=5;
        float area=area(length,width);
    }
}