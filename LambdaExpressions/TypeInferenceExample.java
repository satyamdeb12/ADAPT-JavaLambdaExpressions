package ADAPT.LambdaExpressions;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s)-> s.length();
        System.out.println(myLambda.getlength("Hello Java!"));
    }
    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getlength("Hello Lambda"));
    }
    interface StringLengthLambda{
         int getlength(String s);
    }
}