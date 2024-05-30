package meduim_part;

import java.util.Scanner;

public class Program8 {
	public static void main(String a[]){

		    Scanner sc = new Scanner(System.in);
		    System.out.print("Size of array :");
		    int n=sc.nextInt();

		    int[] num=new int[n];
		    int i,j,tmp,tmp2;


		    for(i=0;i<n;i++){
		        num[i]=sc.nextInt();
		    }

		    for(i=1;i<n;i++){
		        tmp=num[i];
		        for(j=0;j<i;j++){
		            if(num[i-j-1]>tmp){
		                tmp2=num[i-j-1];
		                num[i-j-1]=tmp;
		                num[i-j]=tmp2;
		            }
		            else{
		                break;
		            }
		        }
		    }

		    for(i=0;i<n;i++){
		        System.out.print(num[i]+"  ");
		    }
	        }
	}


