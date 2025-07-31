package com.hyrtutorial.telugu;

public class Test {
	int i;
	int j;

public Test() {
	int i=10;
	int j=20;
	
}
public Test(int i, int j) {
	this.i=i;
	this.i=j;

}
public static void main(String[] args) {
	Test t1 = new Test();
	Test t2 = new Test(30, 40);
	Test t3 = new Test(50, 70);
	System.out.println(t1.add());
	System.out.println(t2.add());
	System.out.println(t3.add());




}
public int add() {
	return i+j;
}

}
