class Player{
    String name;
    int age;
    String sport;

    Player(String n,int a,String s){
        name=n; age=a; sport=s;
    }
    void show(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Sport is "+sport);
    }
}

class Cricket_Player extends Player{
    String country;
    String type;
    Cricket_Player(String name, int age, String sport, String c, String t){
        super(name,age,sport);
        country=c;
        type=t;
    }
    void print(){
        super.show();
        System.out.println("Country :"+country);
        System.out.println("Player type :"+type);
    }
}

class Football_Player extends Player{
    String team;
    String field;
    Football_Player(String name, int age, String sport, String t, String f){
        super(name,age,sport);
        team=t;
        field=f;
    }
    void print(){
        super.show();
        System.out.println("team :"+team);
        System.out.println("field type :"+field);
    }
}

class Hockey_Player extends Player{
    String titles;
    Hockey_Player(String name, int age, String sport, String t){
        super(name,age,sport);
        titles=t;
    }
    void print(){
        super.show();
        System.out.println("team :"+titles);
    }
}
