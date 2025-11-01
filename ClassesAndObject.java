public class ClassesAndObject {
    public static void main(String[] args) {
        rectangle rec1 = new rectangle();
        System.out.println(" The area and perimeter of rectangle of length " + rec1.width +"  and width "+ rec1.length +" is "+ rec1.getArea() + rec1.getPerimeter());
        rectangle rec2 = new rectangle(20,25);
        System.out.println("The area  and perimeter of rectangle of length " + rec2.width +"  and width "+ rec2.length +" is "+ rec2.getArea()+ rec2.getPerimeter());
         rec2.length= 120;
         rec2.width= 120;
        System.out.println("The area  and perimeter of rectangle of length " + rec2.width +"  and width "+ rec2.length +" is "+ rec2.getArea()+ rec2.getPerimeter());
    }
}
    class rectangle{
        int length;
        int width;

     rectangle(){                          //creating Non argument constructer
            length = 1;
            width = 1;

     }
     rectangle(int newLength,int newWidth){                       //Creating arg-constructer
         length = newLength;
         width = newWidth;

     }
        // Area of rectangle
        int getArea(){
         return length * width;

        }
        int getPerimeter(){
         return 2*length*width;
        }

        void setvariables(int newLength,int newWidth){
         length = newLength;
         width = newWidth;
        }
    }

