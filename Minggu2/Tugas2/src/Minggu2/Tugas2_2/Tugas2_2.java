package Minggu2.Tugas2_2;

public class Tugas2_2 {
    public static void main(String[] args) {
        GameCharacter char1 = new GameCharacter("Raiden",10,20);
        GameCharacter char2 = new GameCharacter("Sub-Zero",5,25);
        char1.kick(char2);
        char2.kick(char1);

        for(int i=0;i<3;i++){
            char2.hit(char1);
        }

        for(int i=0;i<4;i++){
            char1.kick(char2);
        }

        System.out.println(char1.getLifePoint());
        System.out.println(char2.getLifePoint());

        char1.compare(char2);
    }
}
