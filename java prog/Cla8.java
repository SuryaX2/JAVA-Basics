class Cla8
{
void max(String a[])
{
int l=0,sl=0,i;
for(i=0;i<a.length;i++)
{
if(l<Integer.parseInt(a[i]))
{
sl=l;
l=Integer.parseInt(a[i]);
}
else if(sl<Integer.parseInt(a[i])&&Integer.parseInt(a[i])!=l)
{
sl=Integer.parseInt(a[i]);
}
}
System.out.println(sl);
}
}
class Demo
{
public static void main(String args[])
{
Cla8 c=new Cla8();
c.max(args);
}
}
