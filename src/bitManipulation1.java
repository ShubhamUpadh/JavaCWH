import java.util.Objects;

public class bitManipulation1 {
    public static void main(String[] args) {
        int n = 1;
        StringBuilder st = new StringBuilder();
        while (n >= 2){
            if (n % 2 == 1) st.append("1");
            else st.append("0");
            n = n / 2;
        }
        st.append(n);
        st.reverse();

        System.out.println(st);
        String b = st.toString();
        int val = 0;
        for (int i = 0; i < b.length(); i++){
            int k = Objects.equals(b.charAt(i),'1') ? 1 : 0;
            val += (int) Math.pow(2,st.length()- i -1 )*k;
        }
        System.out.println(val);
    }
}
