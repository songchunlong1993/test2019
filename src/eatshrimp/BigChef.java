package eatshrimp;
/*
 * scl 2019/08/22
 * 
 * ���
 * 
 * */
public class BigChef {
	//��������
	private int garlic ;
	//��������
	private int ginger;
	//��ơ�ƵĴ���
	private int beer;
	// ��ơ�Ƽ��ʱ��
	private int time;
	
	public BigChef(){
		garlic = 10;
		ginger = 2;
		beer = 3;
		time = 1;
	}
	/*
	 * �����Ϻ
	 * */
	public void makeShrimp(){
		readySeasoning();
		pourOil();
		pourSeasoning();
		friedShrimp();
		pourBeer();
		stewShrimp();
	}
	
	/*
	 * ׼������
	 * */
	private void readySeasoning(){
		System.out.println("׼������: ����"+garlic+"��,����"+ginger+"��");
	}
	
	/*
	 * ����
	 * */
	private void pourOil(){
		System.out.println("����");
	}
	
	/*
	 * ������
	 * */
	private void pourSeasoning(){
		System.out.println("������");
	}
	
	/*
	 * ��Ϻ
	 * */
	private void friedShrimp(){
		System.out.println("��Ϻ��");
	}
	
	/*
	 * ����
	 * */
	private void pourBeer(){
		for(int i=0; i<beer; i++){
			System.out.println("��ơ��: ��"+i+"��");
			System.out.println("--��"+time+"����--");
		}
	}
	
	/*
	 * ��Ϻ
	 * */
	private void stewShrimp(){
		boolean isSoft = true;
		if(isSoft){
			System.out.println("�ػ�");
		}else{
			System.out.println("������");
		}
	}

}
