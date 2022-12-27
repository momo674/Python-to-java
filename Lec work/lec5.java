public class lec5 {
    public static void string_slicing_example1(){
        String word = "abcdefgh";
        String a = word.substring(0,1);
        String c = word.substring(2,3);
        String h = word.substring(word.length()-1,word.length());
        String f = word.substring(word.length()-3,word.length()-2);
        System.out.println(a);
        System.out.println(c);
        System.out.println(h);
        System.out.println(f);
    }
    public static void string_slicing_example2(){
        String s = "Apple";
        String ap = s.substring(0,2);
        String ppl = s.substring(1,4);
        String ple = s.substring(2);
        System.out.println(ap);
        System.out.println(ppl);
        System.out.println(ple);
    }
    public static void for_loop_example(){
        String s = "Apple";
        for (int i = 0; i <= s.length() -1;i ++){
            //System.out.println(s.substring(i,i + 1));
            //use charAt(i) method
            System.out.println(s.charAt(i));
        }
    }
    public static void main(String[] args){
        //test zone
        for_loop_example();
        
    }
}
