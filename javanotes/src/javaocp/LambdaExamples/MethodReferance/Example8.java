package javaocp.LambdaExamples.MethodReferance;

public class Example8 {
    interface Parser{
        String convert(String elem);
    }

    class StringParser implements Parser{

        @Override
        public String convert(String elem) {
            if(elem.length()>3){
                elem.toUpperCase();

            }else if(elem.length()<3){
                elem.toLowerCase();
            }
            return elem;
        }
    }

    class MyPrinter{
        public void print(String elem,Parser p){
            System.out.println();
        }
    }
}
