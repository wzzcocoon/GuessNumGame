import java.util.Scanner;

public class game{
	
	public static void main(String[] args){
		
		 System.out.println(" ......................欢迎来到我的游戏......................");
       System.out.println("                       _oo0oo_                      ");
       System.out.println("                      o8888888o                     ");
       System.out.println("                      88\" . \"88                     ");
       System.out.println("                      (| -_- |)                     ");
       System.out.println("                      0\\  =  /0                     ");
       System.out.println("                    ___/‘---’\\___                   ");
       System.out.println("                  .' \\|       |/ '.                 ");
       System.out.println("                 / \\\\|||  :  |||// \\                ");
       System.out.println("                / _||||| -卍-|||||_ \\               ");
       System.out.println("               |   | \\\\\\  -  /// |   |              ");
       System.out.println("               | \\_|  ''\\---/''  |_/ |              ");
       System.out.println("               \\  .-\\__  '-'  ___/-. /              ");
       System.out.println("             ___'. .'  /--.--\\  '. .'___            ");
       System.out.println("          .\"\" ‘<  ‘.___\\_<|>_/___.’ >’ \"\".          ");
       System.out.println("         | | :  ‘- \\‘.;‘\\ _ /’;.’/ - ’ : | |        ");
       System.out.println("         \\  \\ ‘_.   \\_ __\\ /__ _/   .-’ /  /        ");
       System.out.println("     =====‘-.____‘.___ \\_____/___.-’___.-’=====     ");
       System.out.println("                       ‘=---=’                      ");
       System.out.println("                                                    ");
       System.out.println("....................佛祖开光 ,永无BUG...................");
		
		//生成一个【1,100】的随机数
		int randomNum = (int)(1+100*Math.random());
		
		int count = 10;
		while(count>0){
			count-- ;
			
			//友情提示
			System.out.println("请输入一个1-100的整数：");
			Scanner sc = new Scanner(System.in);
			int printNum = sc.nextInt();
			
			//判断输出
			if(randomNum == printNum){
				System.out.println("！！！猜对了！！！");
				break;
			}else if(randomNum>printNum){
				if(count==0){
						System.out.println("GameOver！");
				}else{
						System.out.println("猜小了！您还剩余"+count+"次");
				}

			}else{
				if(count==0){
						System.out.println("GameOver！");
				}else{
						System.out.println("猜大了！您还剩余"+count+"次");
				}
			}
		}
	}
}