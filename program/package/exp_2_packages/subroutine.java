class routine{
    int a;
    routine(int a){
        this.a=a;
        System.out.println("this is const with par a"+a);
    }
    routine(){
        a=8;
        System.out.println("this is const without par a"+a);
    }
    
    public void display(){
        System.out.println("this is class routine");
    }
}
class subroutine extends routine{
    public void display(){
        System.out.println("this is subroutine");
    }
    public static void main (String[]args){
        routine obj = new routine();
        routine obj2 = new routine(7);
        //routine object = new subroutine();

        obj.display();
        //object.display();

    }
}