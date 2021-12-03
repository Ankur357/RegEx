import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String str  = "123hjg09f9f";
        Pattern p = Pattern.compile("\\D");    //a+,[a]*,[a]? ,\\d,\\D,\\s
        Matcher m = p.matcher(str);
        int ctr=0;
        while(m.find())
        {
            ctr++;
            System.out.println(m.start() + " " + m.end() + " " +m.group());
        }
        System.out.println(ctr);
    }
}
