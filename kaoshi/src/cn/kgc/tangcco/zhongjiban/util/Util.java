package cn.kgc.tangcco.zhongjiban.util;

public class Util {
	public static String getRole(int a) {
		if(a==0) {
			return "����";
		}else if(a==1) 
		{
			return "����Ա";
		}else if(a==2) {
			return "���ž���";
		}
		else if(a==3) {
			return "��ͨԱ��";
		}else {
			return "����";
		}
	}
}
