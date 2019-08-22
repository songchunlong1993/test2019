package eatshrimp;
/*
 * scl 2019/08/22
 * ³Ô»õ
 * */
public class Customer {
	public Customer(){
		eat();
	}
	
	/*
	 * ³Ô»õ
	 * */
	public void eat(){
		WashShrimp washShrimp = new WashShrimp();
		BigChef bigChef = new BigChef();
		washShrimp.begainWashShrimp();
		bigChef.makeShrimp();
	}
	

}
