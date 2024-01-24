public class Player
{
    String name="Aditya Tuteja \n";
    int player_no=1;

    public static void main(String args[]){
        Cricket_Player obj1=new Cricket_Player();
        obj1.cricket();
        Football_Player obj2=new Football_Player();
        obj2.football();
        Hockey_Player obj3=new Hockey_Player();
        obj3.hockey();
    }
}
class Cricket_Player extends Player{
    public void cricket(){
        System.out.println("name is: "+name+"and player no. is: "+player_no);

        System.out.println("cricket field diameter is about 150m");
    }}
class Football_Player extends Player{
    public void football(){
        System.out.println("name is: "+name+"and player no. is: "+player_no);

        System.out.println(" football field is about 1 acres ");
    }}
class Hockey_Player extends Player {
    public void hockey() {
        System.out.println("name is: " + name + "and player no. is: " + player_no);

        System.out.println("hockey field is of 5000 sq.m area");
    }
}