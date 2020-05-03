package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i=i+1;                 //i++ sama dengan i=i+1
        System.out.println(i); //i tadi 2 skrg jadi 3

        i+=3; // sama dengan i=i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3; // sama dengan i=i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);

    }
}
