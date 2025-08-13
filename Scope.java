public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        {
            a = 78; // already iniitiased so not initialised again
            int c = 99;
            // value initialized in this block , will remain in this block cannot used outside the block
        }

        //System.out.println(c);
    }

    static void random(int marks){
        int num = 44;
        System.out.println(num);
        System.out.println(marks);
    }
}
