package easy;

public class ReplaceSpace {
    public static String replaceSpace(String s) {
        s = s.replaceAll(" ","%20");
        return s;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("we are happy."));
    }
}
