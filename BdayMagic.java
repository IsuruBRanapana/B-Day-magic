import java.util.Scanner;
public class BdayMagic{
	public static void main(String []args){
		//Create scanner
		Scanner input=new Scanner(System.in);
		//add sets
		String set01=   " 1   3   5   7\n"+
				" 9  11  13  15\n"+
				"17  19  21  23\n"+
				"25  27  29  31\n";

		String set02=   " 2   3   6   7\n"+
				"10  11  14  15\n"+
				"18  19  22  23\n"+
				"26  27  30  31\n";

		String set03=   " 4   5   6   7\n"+
				"12  13  14  15\n"+
				"20  21  22  23\n"+
				"28  29  30  31\n";

		String set04=   " 8   9  10  11\n"+
				"12  13  14  15\n"+
				"24  25  26  27\n"+
				"28  29  30  31\n";

		String set05=   "16  17  18  19\n"+
				"20  21  22  23\n"+
				"24  25  26  27\n"+
				"28  29  30  31\n";
		int a=0;
		System.out.println("Is your b'day in set 01?");
		System.out.println(set01);
		System.out.print("If your b'day in set 01 enter 1 , else enter 0 :- ");
		int answer1=input.nextInt();

		if(answer1==1){
			a+=1;
		}

		System.out.println("Is your b'day in set 02?");
		System.out.println(set02);
		System.out.print("If your b'day in set 01 enter 1 , else enter 0 :- ");
		int answer2=input.nextInt();

		if(answer2==1){
			a+=2;
		}

		System.out.println("Is your b'day in set 03?");
		System.out.println(set03);
		System.out.print("If your b'day in set 01 enter 1 , else enter 0 :- ");
		int answer3=input.nextInt();

		if(answer3==1){
			a+=4;
		}

		System.out.println("Is your b'day in set 04?");
		System.out.println(set04);
		System.out.print("If your b'day in set 01 enter 1 , else enter 0 :- ");
		int answer4=input.nextInt();

		if(answer4==1){
			a+=8;
		}

		System.out.println("Is your b'day in set 05?");
		System.out.println(set05);
		System.out.print("If your b'day in set 01 enter 1 , else enter 0 :- ");
		int answer5=input.nextInt();

		if(answer5==1){
			a+=16;
		}

		System.out.println("Your b'day is "+a);
	}

}