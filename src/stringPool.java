public class stringPool {
    public  void main(String[] args) {
        String s = "abv";
        String s2 = "abv";
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
