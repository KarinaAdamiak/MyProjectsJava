public class SquareYear3Ways {

    public static void main (String [] args){
        int year = 2022;
        System.out.println(year*year);

/*
The second way)
        public static void main (String [] args){
            int year = 2022;
            int square = year * year;

            System.out.println(square);

The third way--> METHOD
           public static int myMethod ( int year){
                return year * year;
            }
            public static void main (String[]args){
                System.out.println(myMethod(2022));

*/          }
        }