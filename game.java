import java.util.Scanner;

public class game{
	
	public static void main(String[] args){
		
		 System.out.println(" ......................��ӭ�����ҵ���Ϸ......................");
       System.out.println("                       _oo0oo_                      ");
       System.out.println("                      o8888888o                     ");
       System.out.println("                      88\" . \"88                     ");
       System.out.println("                      (| -_- |)                     ");
       System.out.println("                      0\\  =  /0                     ");
       System.out.println("                    ___/��---��\\___                   ");
       System.out.println("                  .' \\|       |/ '.                 ");
       System.out.println("                 / \\\\|||  :  |||// \\                ");
       System.out.println("                / _||||| -�d-|||||_ \\               ");
       System.out.println("               |   | \\\\\\  -  /// |   |              ");
       System.out.println("               | \\_|  ''\\---/''  |_/ |              ");
       System.out.println("               \\  .-\\__  '-'  ___/-. /              ");
       System.out.println("             ___'. .'  /--.--\\  '. .'___            ");
       System.out.println("          .\"\" ��<  ��.___\\_<|>_/___.�� >�� \"\".          ");
       System.out.println("         | | :  ��- \\��.;��\\ _ /��;.��/ - �� : | |        ");
       System.out.println("         \\  \\ ��_.   \\_ __\\ /__ _/   .-�� /  /        ");
       System.out.println("     =====��-.____��.___ \\_____/___.-��___.-��=====     ");
       System.out.println("                       ��=---=��                      ");
       System.out.println("                                                    ");
       System.out.println("....................���濪�� ,����BUG...................");
		
		//����һ����1,100���������
		int randomNum = (int)(1+100*Math.random());
		
		int count = 10;
		while(count>0){
			count-- ;
			
			//������ʾ
			System.out.println("������һ��1-100��������");
			Scanner sc = new Scanner(System.in);
			int printNum = sc.nextInt();
			
			//�ж����
			if(randomNum == printNum){
				System.out.println("�������¶��ˣ�����");
				break;
			}else if(randomNum>printNum){
				if(count==0){
						System.out.println("GameOver��");
				}else{
						System.out.println("��С�ˣ�����ʣ��"+count+"��");
				}

			}else{
				if(count==0){
						System.out.println("GameOver��");
				}else{
						System.out.println("�´��ˣ�����ʣ��"+count+"��");
				}
			}
		}
	}
}