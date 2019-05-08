package pr5;

public class Ex10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
		
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		String src = "abc123";
		String result = "";
		
		//문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if('a'<=ch && ch <= 'z')  {
				ch -= 97;
				result += abcCode[ch];
			}
			if('1' <= ch && ch <= '9') {
				ch -= 48;
				result += numCode[ch];
			}
			
		}
		
		System.out.println("src: "+src);
		System.out.println("result: "+result);
	}
}