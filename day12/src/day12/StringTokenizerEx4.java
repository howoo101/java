package day12;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {
	public static void main(String[] args) {
		String input = "��ʸ���õ��ʿ�";
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}
	
	public static long hangulToNum(String input) { //�ѱ��� ���ڷ� �ٲٴ� �޼ҵ�
		long result = 0; 	//���� ��ȯ����� �����ϱ� ���� ����
		long tmpResult = 0;	//�ʹ�õ ������ ���� �����ϱ� ���� �ӽú���
		long num = 0;
		
		final String NUMBER = "�����̻�����ĥ�ȱ�";
		final String UNIT = "�ʹ�õ������";
		final long[] UNIT_NUM = {10,100,1000,10000,(long)1e8,(long)1e12};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			int check = NUMBER.indexOf(token); // ��������, ����(UNIT)���� Ȯ���Ѵ�.
			System.out.println("check "+check);
			if(check==-1) {//�����ΰ��
				if("������".indexOf(token)==-1) {
					tmpResult += (num!=0 ? num : 1)
									* UNIT_NUM[UNIT.indexOf(token)];
				} else {
					tmpResult += num;
					result += (tmpResult !=0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			} else { //�����ΰ��
				num = check;
			}
		}
		
		return result + tmpResult + num;
	}
}