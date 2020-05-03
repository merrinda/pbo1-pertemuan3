package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("MHS     : \"terimakasih bapak\"");
                System.out.println("Dosen   : \"selamat yaa\"");
                break;
            case 'B':
                System.out.println("MHS     : \"ulun handak A pak?\"");
                System.out.println("Dosen   : \"makanya gawi tugas!!!\"");
                break;
            case 'C':
                System.out.println("MHS     : \"ulun masuk terus pak, tugas jua..\"");
                System.out.println("Dosen   : \"tapi kamu gak masuk UAS\"");
                System.out.println("MHS     : \"astagfirullah,,,ulun kada ingat pak ae\"");
                break;
                default:
                    System.out.println("MHS     : \"Ulun UTS dan UAS turun pak\"");
                    System.out.println("Dosen   : \"tapi kamu kelas kada tapi masuk\"");
                    System.out.println("Dosen   : \"*meambilakan absennya\"");
                    System.out.println("Dosen   : \"mehantak ke meja\"");
                    System.out.println("MHS     : \"astagfirullah,,,khilaf pak hihi\"");
                    break;
        }
    }
}
