package Bai2;
import java.io.PrintWriter;

import javax.print.attribute.standard.MediaSize.Other;
public class Main {
	public static void main(String[] args) {
		MaTran m=new MaTran();
		int[][] a=m.read();
		int[][] b=m.read();
		int[][] c=m.tong(a, b);
		int[][] d=m.hieu(a, b);
		System.out.println("Ma Tran c");
		m.viet(c);
		System.out.println("Ma Tran d");
		m.viet(d);
		PrintWriter out;
		try {
			out=new PrintWriter("src/Bai2/matran.txt");
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					out.write(a[i][j]+" ");
				}
				out.write("\n");
			}
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
