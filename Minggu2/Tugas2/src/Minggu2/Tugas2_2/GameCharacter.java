package Minggu2.Tugas2_2;

public class GameCharacter {
    private String name;
    private int lifePoint =100;
    private int attackHitPoint;
    private int attackKickPoint;

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }
    public String getName() {
        return name;
    }
    public int getLifePoint() {
        return lifePoint;
    }
    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }
    public void kick(GameCharacter chara){
        chara.setLifePoint(chara.getLifePoint()-this.attackKickPoint);
        System.out.println(chara.getName()+" got kicked by "+this.name);
    }
    public void hit(GameCharacter chara){
        chara.setLifePoint(chara.getLifePoint()-this.attackHitPoint);
        System.out.println(chara.getName()+" got hitted by "+this.name);
    }
    public void compare(GameCharacter chara){
        int result = Integer.compare(this.lifePoint, chara.getLifePoint());
        if(result>0){
            System.out.println(this.name+" adalah PEMENANGNYAAA!!!");
        }else if(result<0){
            System.out.println(chara.getName()+" adalah PEMENANGNYAAA!!!");
        }else{
            System.out.println("Keduanya seri");
        }
    }
}
