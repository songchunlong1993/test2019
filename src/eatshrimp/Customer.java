package eatshrimp;
/*
 * scl 2019/08/22
 * �Ի�
 * */
public class Customer {
	public Customer(){
		eat();
	}
	
	/*
	 * �Ի�
	 * */
	public void eat(){
		WashShrimp washShrimp = new WashShrimp();
		BigChef bigChef = new BigChef();
		washShrimp.begainWashShrimp();
		bigChef.makeShrimp();
	}
	

}
