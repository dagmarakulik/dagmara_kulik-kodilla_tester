public class Loops {
    public static void main(String[] args) {
        String [] names = new String [] {"Aleksandra", "Bianka", "Matylda", "Hanna", "Malwina"};
        int numberOfElements = names.length;
        for (int i = 0; i <numberOfElements; i++) {
            System.out.println(names[i]);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
