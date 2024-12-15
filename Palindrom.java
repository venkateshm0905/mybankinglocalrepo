public class Palindrom {
    public static void main(String[] args) {
        String s="malayalm";

        String temp="";

        for(int i=s.length()-1;i>=0;i--)
        {
            temp=temp+s.charAt(i);
        }
        if(s.equals(temp))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not palindrome");
    }
}
