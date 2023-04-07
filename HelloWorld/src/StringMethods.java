public class StringMethods {
    
    public static void main(String[] args) {
        String str = "Hello";
        String s = new String("Hello");
      
        System.out.println(str.equals("Hello")); //prints true
        System.out.println(str == s); //prints false
        System.out.println(str.equals(s)); //prints true

        System.out.println(str.length()); //prints length of string

        System.out.println(str.indexOf('H')); //index of the letter H
      }
}
