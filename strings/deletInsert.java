public class deletInsert {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        sb.append("xyz");
        System.out.println(sb);
        sb.delete(2,6 );
        System.out.println(sb);//abyz->abgyz
    }
}
