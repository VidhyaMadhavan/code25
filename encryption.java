import java.util.*;
class encryption
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2;
s1=sc.nextLine();
s2=sc.nextLine();
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
int a[]=new int[s1.length()];
int b[]=new int[s2.length()];
if(s1!=null)
{
for(int i=0;i<ch1.length;i++)
{
if(ch1[i]>0&&ch1[i]<=9)
{
System.out.println("Invalid");
}
else
{
a[i]=(int)ch1[i]+10;
if(a[i]>=123)
{
int t=a[i]-122;
a[i]=96+t;
}
ch1[i]=(char)a[i];
}
}
}
if(s2!=null)
{
for(int i=0;i<ch2.length;i++)
{
if(ch2[i]>0&&ch2[i]<=9)
{
System.out.println("Invalid");
}
else
{
b[i]=(int)ch2[i]+10;
if(b[i]>=123)
{
int t=b[i]-122;
b[i]=96+t;
}
ch2[i]=(char)b[i];
}
}
}
System.out.print(ch1);
System.out.print(" ");
System.out.println(ch2);
}
}

