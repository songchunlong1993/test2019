package eatshrimp;
/*
 * scl 2019/08/22
 * 
 * ϴϺ��
 * 
 * */
public class WashShrimp extends FatherOfWashShrimp {
	
	/*
	 * ϴ��ϴϺ
	 * */
	public void begainWashShrimp(){
		cutHead();
		drawLine();
		wash();
	}
	
	
	/*
	 * ��Ϻͷ
	 * */
	private void cutHead(){
		System.out.println("��Ϻͷ");
	}
	
	/*
	 * ��Ϻ��
	 * */
	private void drawLine(){
		System.out.println("��Ϻ��");
	}
	
	/*
	 * ϴϺ
	 * */
	private void wash(){
		System.out.println("ϴϺ");
	}

}
