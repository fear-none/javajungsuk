package ch11;

public class Hey {
	public static void main(String[] args) {
		String s = "my name is Rob";
		char c = s.charAt(6);
		System.out.println(c);
		
		MyStack ms = new MyStack();
		ms.push("1");
		ms.push("2");
		ms.push("3");
		
		System.out.println(ms.pop());
		System.out.println(ms.indexOf("1"));
		
		
	}
	
}
