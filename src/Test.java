import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str  = "0932356785abc gla123123123123123 879878932789472374asddf";
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(str);
        int ctr=0;
        while(m.find())
        {
            ctr++;
           // System.out.println(m.group());
            System.out.println(m.start() + " " + m.end() + " " +m.group());
        }
        System.out.println(ctr);
    }
}
