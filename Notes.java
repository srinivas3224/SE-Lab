

Example 6:
==============================================

class Parent
{
	Parent(int a)
	{
		System.out.println("This is 1 org parent constructor....");
	}

}

class Child extends Parent
{
	Child()
	{
		
		System.out.print("child class constructor...");
	}
		public static void main(String[] args )
	{
			new Child();
	}
}

This is 1 org parent constructor....child class constructor...
D:\DS_JAVA_PROGRAMES\inheritence>javac Test3c6.java
Test3c6.java:15: error: constructor Parent in class Parent cannot be applied to given types;
                 super();
                 ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error