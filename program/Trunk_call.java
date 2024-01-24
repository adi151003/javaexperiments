class Trunk_call{
int ordinary_rate=27;
int urgent_rate=44;
int lighting_rate=54;
public static void  main(String args[]){
ordinary o=new ordinary();
o.charges(7);
urgent u=new urgent();
u.charges(5);
lighting l=new lighting();
l.charges(3);
}
}
class ordinary extends Trunk_call{
void charges(int min){
System.out.println(ordinary_rate*min);
}}
class urgent extends Trunk_call{
void charges(int min){
System.out.println(urgent_rate*min);
}}
class lighting extends Trunk_call{
void charges(int min){
System.out.println(lighting_rate*min);
}}