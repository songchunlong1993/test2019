package eatshrimp;
/*
 * scl 2019/08/22
 * 
 * Ï´Ïº¹¤
 * 
 * */
public class WashShrimp extends FatherOfWashShrimp {
	
	/*
	 * Ï´¹¤Ï´Ïº
	 * */
	public void begainWashShrimp(){
		cutHead();
		drawLine();
		wash();
	}
	
	
	/*
	 * ¼ôÏºÍ·
	 * */
	private void cutHead(){
		System.out.println("¼ôÏºÍ·");
	}
	
	/*
	 * ³éÏºÏß
	 * */
	private void drawLine(){
		System.out.println("³éÏºÏß");
	}
	
	/*
	 * Ï´Ïº
	 * */
	private void wash(){
		System.out.println("Ï´Ïº");
	}

}
