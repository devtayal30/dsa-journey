public class SkipString {
    public static void main(String[] args) {
        System.out.println(skip2("dssapplecc"));
    }

    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skip2(up.substring(5));
        } else{
            return up.charAt(0)+ skip2(up.substring(1));
        }
    }
}
