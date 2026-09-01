package QQjava0109;

public class Main {
    public static int first = -1;
    public static int last = -1;

    public static void findocc(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar = str.charAt(idx);
        if (currentchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findocc(str, idx + 1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findocc(str, 0, 'a');
    }
}
