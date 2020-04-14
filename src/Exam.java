public class Exam {
    public static void main(String[] args) {
        String str = "Án mạng trên tàu";
        String a = "án mạng";
        str = str.toLowerCase();
        System.out.println(str);
        a = a.toLowerCase();
        System.out.println(a);
        System.out.println(str.contains(a));
    }
}
