package Bai3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.security.KeyStore.PrivateKeyEntry;



public class Array {
	private BufferedReader tenBufferedReader;
	private int lengtharr;
	public Array()
	{
		try {
			tenBufferedReader =new BufferedReader(new FileReader("src/Bai3/array.txt"));
			String[] arr=tenBufferedReader.readLine().split("\\s+");
			lengtharr=arr.length;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public int[] read()
	{
		int[] array=new int[lengtharr];
		try {
			tenBufferedReader =new BufferedReader(new FileReader("src/Bai3/array.txt"));
			String[] arr=tenBufferedReader.readLine().split("\\s+");
			for(int i=0;i<arr.length;i++)
			{
				array[i]=Integer.parseInt(arr[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return array;
	}
	public int tong(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public boolean snt(int a) {
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
}
