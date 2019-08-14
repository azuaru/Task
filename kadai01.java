import java.util.*;

import java.util.Random;

import java.util.Scanner;


public class Main {
    
	public static void main(String[] args) throws Exception {
 
       	// Your code here!
       
	System.out.println("敵機の数(1~10)");
 
        
	Scanner scan = new Scanner(System.in);
 
        
	int en = scan.nextInt();
       
 	System.out.println(en);
       
 	if((en < 1) || (en > 10)){
            
		System.out.println("範囲外の数値です");
           
	 	System.exit(0);
        
	}else{
            
		Random random = new Random();
           
	 	int jiki[];
            
		jiki = new int[4];
           
	 	jiki[0] = random.nextInt(100);
           
	 	jiki[1] = random.nextInt(100);
           
		 jiki[2] = 20;
           
	 	jiki[3] = 20;
           
	 	int enemy[][];
            
		int enno = 0;
           
	 	enemy = new int[en][4];
           
	 	while(enno < en){
               
	 		int cnt = 0;
                
			while(cnt < 2){
                    
			enemy[enno][cnt] = random.nextInt(100);

 	                 		cnt = cnt + 1;
               
 		}

		while(cnt < 4){

 	                   		enemy[enno][cnt] = 10;
                   
 			cnt = cnt + 1;
               
 		}
               
	 	enno = enno + 1;
            
	}
           
	 enno = 0;
           
	 int cnt = 0;
           
	 int x = 0;
          
 	 int y = 0;
            
	//System.out.println(enemy[enno][cnt] +","+ (enemy[enno][cnt] + 10));
            
	while(enno < en){
	                
    while(enemy[enno][cnt] <= enemy[enno][cnt] + 10){

	                    if((jiki[0] <= enemy[enno][cnt]) && (enemy[enno][cnt] <= jiki[0] + 20)){

	                        x = 1;

	                        enemy[enno][cnt] = enemy[enno][cnt] + 1;
 
	                   }else{

	                        enemy[enno][cnt] = enemy[enno][cnt] + 1;

	                    }

	                }

	                cnt = cnt + 1;
 
	                while(enemy[enno][cnt] <= enemy[enno][cnt] + 10){
 
 	                  if((jiki[1] <= enemy[enno][cnt]) && (enemy[enno][cnt] <= jiki[1] + 20)){

 	                       y = 1;

  	                      enemy[enno][cnt] = enemy[enno][cnt] + 1;

   	                 }else{

    	                    enemy[enno][cnt] = enemy[enno][cnt] + 1;
 
    	               }

    	            }
 
	               enno = enno + 1;

 	               cnt = 0;
	               if((x == 1) && (y == 1)){
 
 	                  System.out.println("当たってしまいました");

 	                   System.exit(0);

	                }
 
	           }
 
	           System.out.println("回避成功！");
 
	           System.exit(0);           
    
        
	}

    
	}

}