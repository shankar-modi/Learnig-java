package com.sk.learn;

class T {
	 public T() {
		System.out.println("Default class T");
	}
	void m(){
		System.out.println("outer");
	}
}
public class InnerClass {

	public InnerClass() {
		System.out.println("Inner class ");
	}
	public static void main(String[] args) {
		new InnerClass().go();
	}
	
	void go(){
		class T {
			public T(){
				System.out.println("T - inner");
			}
			void m(){
				System.out.println("inner");
			}
		}
		
		
		new T().m();
//		class T {
//			public T(){
//				System.out.println("T - inner");
//			}
//			void m(){
//				System.out.println("inner");
//			}
//		} 
	}
	
//	class T{
//		public T(){
//			System.out.println("T middle");
//		}
//		
//		void m(){
//			System.out.println("middle");
//		}
//	}
}
