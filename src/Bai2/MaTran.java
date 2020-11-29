package Bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class MaTran {
	private int hang,cot;
	private BufferedReader ten;
	public MaTran()
	{
		try {
			ten=new BufferedReader(new FileReader("src/Bai2/matran.txt"));
			String[] arr=ten.readLine().split("\\s+");
			hang=cot=Integer.parseInt(arr[0]);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	//ham tham so int[][[ yeu cau tra ve mot mang hai chieu
	public int[][] read()
	{
		//khai bao mot mang hai chieu co do dai hang cot
		int[][] t=new int[hang][cot];
		try {
			for(int i=0;i<hang;i++)
			{
				//khai bao mot chuoi chua cac ki tu
				String[] arr=ten.readLine().split("\\s+");//loc dau cach, 
				for(int j=0;j<cot;j++)
				{
					//vi tri hang, cot
					t[i][j]=Integer.parseInt(arr[j]);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return t;
	}
	public int[][] tong(int[][] a, int[][] b)
	{
		int[][] t=new int[hang][cot];
		for(int i=0;i<hang;i++)
		{
			for(int j=0;j<cot;j++)
			{
				t[i][j]=a[i][j]+b[i][j];
			}
		}
		return t;
	}
	public int[][] hieu(int[][] a, int[][] b)
	{
		int[][] t=new int[hang][cot];
		for(int i=0;i<hang;i++)
		{
			for(int j=0;j<cot;j++)
			{
				t[i][j]=a[i][j]-b[i][j];
			}
		}
		return t;
	}
	public void viet(int[][] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
	}
}
