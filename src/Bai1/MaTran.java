package Bai1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
public class MaTran{
	private int hang,cot;
	private BufferedReader br=null;
	public MaTran() {
		try {
			br=new BufferedReader(new FileReader("src/Bai1/matran.txt"));
			String[] strings=br.readLine().split("\\s+");
			hang=Integer.parseInt(strings[0]);
			cot=Integer.parseInt(strings[1]);
					
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public int[][] read()
	{
		int[][] t=new int[hang][cot];
		try {
			for(int i=0;i<hang;i++)
			{
				String[] strings=br.readLine().split("\\s+");
				for(int j=0;j<cot;j++)
				{
					t[i][j]=Integer.parseInt(strings[j]);
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return t;
	}
	public int[][] tong(int [][] a, int[][]  b)
	{
		int[][] t=new int[hang][cot];
		for(int i=0;i<hang;i++)
		{
			for(int j=0;j<cot;j++)
				t[i][j]=a[i][j]+b[i][j];
		}
		return t;
	}
	public int[][] hieu(int [][] a, int[][]  b)
	{
		int[][] t=new int[hang][cot];
		for(int i=0;i<hang;i++)
		{
			for(int j=0;j<cot;j++)
				t[i][j]=a[i][j]-b[i][j];
		}
		return t;
	}
	public void viet(int[][] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}
	}
}