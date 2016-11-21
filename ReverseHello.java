public class ReverseHello {
    void Reverse(String word) {
        char[] chArr=word.toCharArray();
        StringBuilder ReverseSayHello=new StringBuilder();
        for(int i=chArr.length-1;i>=0;i--) {
            ReverseSayHello.append(chArr[i]);
        }
        System.out.println(ReverseSayHello);
    }
    public static void main(String[] args) {
        String Hello="Hello";
        new ReverseHello().reverse(Hello);
    }
}