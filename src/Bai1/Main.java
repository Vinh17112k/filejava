package Bai1;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Main{
	public static void main(String[] args) {
		MaTran m=new MaTran();
		int[][] a=m.read();
		int[][] b=m.read();
		int[][] c=m.tong(a, b);
		int[][] d=m.hieu(a, b);
		m.viet(a);
		m.viet(b);
		m.viet(c);
		m.viet(d);
		PrintWriter out;
		String file="src/Bai1/ketqua.dat";
		//viet ma tran a
		try {
			out=new PrintWriter(file);
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
					out.write(a[i][j]+" ");
				out.write("\n");
			}
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[0].length;j++)
					out.write(b[i][j]+" ");
				out.write("\n");
			}
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[0].length;j++)
					out.write(c[i][j]+" ");
				out.write("\n");
			}
			for(int i=0;i<d.length;i++)
			{
				for(int j=0;j<d[0].length;j++)
					out.write(d[i][j]+" ");
				out.write("\n");
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}