package kadai02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String card[];
		int number[];
		String suit[];
		int flash = 0;
		int straight =0;
		int full = 0;
		int four = 0;
		int three = 0;
		int two = 0;
		int one = 0;

		card = new String[5];
		number = new int[5];
		suit = new String[5];
		List<String> Csuit = new ArrayList<String>();
		String No = null;
		Map<List<String>,String>mMap=new HashMap<List<String>,String>();

		for(int i=0; i<5; i++) {



		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    System.out.print("マークを入力(0～3) > ");

	    int suitN = scanner.nextInt();
	    if(suitN < 0 || 3 < suitN) {
	    	System.out.println("既定の範囲外です");
	    	System.exit(0);
	    }
	    if(suitN == 0) {
	    	Csuit.add("S");
	    }else if(suitN == 1) {
	    	Csuit.add("C");
	    }else if(suitN == 2) {
	    	Csuit.add("D");
	    }else if(suitN == 3) {
	    	Csuit.add("H");
	    }

	    System.out.print("数字を入力(1～13) > ");

	    int num = scanner.nextInt();
	    if(num < 1 || 13 < num) {
	    	System.out.println("既定の範囲外です");
	    	System.exit(0);
	    }

	    String num_str = String.format("%02d", num);//01 03表記にする
	    System.out.println(suitN+" "+num_str);
	    if(num < 11 && num > 1) {
	    	No = String.valueOf(num);
	    }else if(num == 1){
	    	No = "A";
	    }else if(num == 11) {
	    	No = "J";
	    }else if(num == 12) {
	    	No = "Q";
	    }else if(num == 13) {
	    	No = "K";
	    }

	    card[i] = Csuit + No;//SA,D10etc...
	    number[i] = num;
	    //suit[i] = ;
	    mMap.put(Csuit,No);//マークと数字

		}

		List<Entry<List<String>, String>> list_entries = new ArrayList<Entry<List<String>, String>>(mMap.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<List<String>, String>>() {
            public int compare(Entry<List<String>, String> obj1, Entry<List<String>, String> obj2) {
                // 4. 昇順
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });

		for(Entry<List<String>, String> entry : list_entries) {
            System.out.println(entry.getKey() + entry.getValue());
        }


		/*for(int i=0; i<5; i++) {
			if(i==4) {
				System.out.print(card[i]);
			}else {
				System.out.print(card[i]+",");
			}
		}*/
		for(int i=0; i<suit.length - 1;i++) {
			if(suit[i] != suit[i+1]) {
				break;
			}else if(i==4){
				flash = 1;
			}
		}

		for(int i=0; i<number.length-1;i++) {

		}
		if(flash == 1 && straight == 1) {
			for(int i=0;i<card.length-1;i++) {
				for(int j=0; j<4; j++) {

				}
			}
		}else if(flash == 1 && straight == 0) {
			System.out.println("フラッシュ");
		}else if(flash == 0 && straight == 1) {
			System.out.println("ストレート");
		}

	}

}
