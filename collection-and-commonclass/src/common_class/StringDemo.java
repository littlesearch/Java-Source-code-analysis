package common_class;

public class StringDemo {
	private String str = "helloWorld";
	static  int x;
	/**
	 * ���ַ������һ���ַ�����
	 */
	public void tocharyArry() {
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println("תΪ�������:" + c[i]);
		}
	}

	/**
	 * ���ַ�����ȡ��ָ��λ�õ��ַ�
	 */
	public void tocharAt() {
		char c = str.charAt(3);
		System.out.println("ָ���ַ�Ϊ��" + c);
	}

	/**
	 * ���ַ������һ��byte����
	 */
	public void tobyte() {
		byte b[] = str.getBytes();
		System.out.println("ת����byte�������Ϊ��" + new String(b));
	}


	/**
	 * ȥ���ַ������ҿո�
	 */
	public void totrim() {
		String str1 = "       hello         ";
		System.out.println("ȥ�����ҿո�����:" + str1.trim());
	}

	/**
	 * �ַ����Ľ�ȡ
	 */
	public void tosubstring() {
		System.out.println("��ȡ����ַ�Ϊ��" + str.substring(0, 3));// ��ȡ0-3��λ�õ�����
		System.out.println("�ӵ�3��λ�ÿ�ʼ��ȡ��" + str.substring(2));// �ӵ�3��λ�ÿ�ʼ��ȡ
	}

	/**
	 * ����ָ�����ַ�������ַ�����ֵ����ݽ����ַ����������ʽ����
	 */
	public void tosplit() {
		String s[] = str.split("e");// ��hello�е�e�����ַ������
		for (int i = 0; i < s.length; i++) {
			System.out.println("��ֺ���Ϊ��" + s[i]);
		}
	}


	/**
	 * ɾ���ײ���β���ո�
	 */
	public void deleteWhitespace() {

		String string = "  hello world  ";
		System.out.println("�� " + "  hello world  " + "��ǰ��ո�ȥ��" + string.trim());
	}

	/**
	 * �ж��Ƿ���ָ�����ַ�����ͷ���߽�β
	 */
	public void tostartsWithOrendWith() {
		if (str.startsWith("he"))// �ж��ַ����Ƿ���he��ͷ
		{
			System.out.println("�ַ�������he��ͷ");
		}
		if (str.endsWith("lo")) {
			System.out.println("�ַ�������lo��β");
		}
	}

	/**
	 * ����String�������ݱȽ�
	 */
	public void toequals() {
		String str3 = "world";
		if (str.equals(str3)) {
			System.out.println("������String���͵�ֵ���");
		} else
			System.out.println("������String���͵Ĳ�ֵ���");
	}

	/**
	 * �����ַ��������ִ�Сд���бȽ�
	 */
	public void toequalslgnoreCase() {
		String str4 = "HELLO";
		if (str.equalsIgnoreCase(str4)) {
			System.out.println("hello��HELLO���Դ�Сд�Ƚ�ֵ���");
		}
	}

	/**
	 * ��һ��ָ���õ��ַ����滻�������ַ���
	 */
	public void toreplaceAll() {
		String str5 = str.replaceAll("l", "a");
		System.out.println("�滻��Ľ��Ϊ��" + str5);
	}

	public static void main(String[] args) {
		StringDemo obj = new StringDemo();
		obj.tocharyArry();
		obj.tocharAt();
		obj.tobyte();
		obj.totrim();
		obj.tosubstring();
		obj.tosplit();
		obj.deleteWhitespace();
		obj.tostartsWithOrendWith();
		obj.toequals();
		obj.toequalslgnoreCase();
		obj.toreplaceAll();
		System.out.println(obj.x);
	}
}