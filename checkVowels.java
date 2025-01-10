public class checkVowels {
    public static void main(String[] args) {
        char[] vowels = {'a','e','i','o','u'};
        String str = "supercalifragilisticexpialidocious";
        int c = 0;

        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<vowels.length; j++){
                if(str.charAt(i)==vowels[j]){
                    c++;
                }
            }
        }

        System.out.println("Number of vowels : "+ c);
    }
}
