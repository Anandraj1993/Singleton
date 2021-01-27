package org.single;

public class SingletonClass {
public static SingletonClass s; 
public static  SingletonClass getMethod() {
if (s==null) {
	s=new SingletonClass();
}
return s;
}
private void getm1() {
System.out.println("Method1");
}
public static void main(String[] args) {
	SingletonClass class1 = getMethod();
	System.out.println(System.identityHashCode(class1));
	class1.getm1();
	
}



}
