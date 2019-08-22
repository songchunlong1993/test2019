package eatshrimp;
/*
 * scl 2019/08/22
 * 
 * 大厨
 * 
 * */
public class BigChef {
	//大蒜数量
	private int garlic ;
	//生姜数量
	private int ginger;
	//加啤酒的次数
	private int beer;
	// 加啤酒间隔时间
	private int time;
	
	public BigChef(){
		garlic = 10;
		ginger = 2;
		beer = 3;
		time = 1;
	}
	/*
	 * 大厨做虾
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
	 * 准备调料
	 * */
	private void readySeasoning(){
		System.out.println("准备调料: 大蒜"+garlic+"个,生姜"+ginger+"两");
	}
	
	/*
	 * 倒油
	 * */
	private void pourOil(){
		System.out.println("倒油");
	}
	
	/*
	 * 倒调料
	 * */
	private void pourSeasoning(){
		System.out.println("倒调料");
	}
	
	/*
	 * 炒虾
	 * */
	private void friedShrimp(){
		System.out.println("炒虾仁");
	}
	
	/*
	 * 倒油
	 * */
	private void pourBeer(){
		for(int i=0; i<beer; i++){
			System.out.println("加啤酒: 第"+i+"次");
			System.out.println("--等"+time+"分钟--");
		}
	}
	
	/*
	 * 焖虾
	 * */
	private void stewShrimp(){
		boolean isSoft = true;
		if(isSoft){
			System.out.println("关火");
		}else{
			System.out.println("继续焖");
		}
	}

}
