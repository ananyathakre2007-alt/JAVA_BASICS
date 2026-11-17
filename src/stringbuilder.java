public class stringbuilder {

    public static void main() {

        StringBuilder name = new StringBuilder();

        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            name.append(ch);
        }
        System.out.println(name);
    }
}
