class LogicalORandAND{
public static void main(String...args){
int x=100;
int y=90;
System.out.println((x>y)||(x==y));
System.out.println((x<y)||(++x)>y);
System.out.println(++x);
System.out.println(--y);
System.out.println((x<y)&&(x>y));
System.out.println(y);
System.out.println(x++);
System.out.println(x--);
System.out.println((x==y)&&(++x)>y);
System.out.println(y--);
}
}