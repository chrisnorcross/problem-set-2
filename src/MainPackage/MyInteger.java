package MainPackage;

public class MyInteger {
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	public boolean isEven(){
		if(value % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	public boolean isOdd(){
		if(value %2 == 1){
			return true;
		}else{
			return false;
		}
		}
	public boolean isPrime(){
		if(value%2 == 0){
			return false;
		}
		for(int n=3; n*n<=value;n+=2){
			if(value % n == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isOdd(int value){
		if(value % 2 == 1){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isEven(int value){
		if(value % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isPrime(int value){
		if(value%2==0){
			return false;
		}
		for (int n=3; n*n <= value; n +=2){
			if(value%n == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger n){
		return n.isEven();
	}
	public static boolean isOdd(MyInteger n){
		return n.isOdd();
	}
	public static boolean isPrime(MyInteger n){
		return n.isPrime();
	}
	public boolean equals(int n){
		return (value == n);
	}
	public boolean equals(MyInteger n){
		return (value == n.getValue());
	}
	public static int parseInt(String s){
		return Integer.parseInt(s);
	}
	public static int parseInt(char[] a){
		return parseInt(new String(a));
	}	

}
