package Bai3;

import java.io.PrintWriter;


public class Main {
	public static void main(String[] args) {
		Array arr = new Array();
		int[] a = arr.read();
		System.out.println("Tong: " + arr.tong(a));
		PrintWriter out;

		try {
			out = new PrintWriter("src/Bai3/ketqua.dat");
			for (int i = 0; i < a.length; i++) {
				out.write(a[i] + " ");
			}
			out.write("\n" + arr.tong(a)+"\n");
			for (int i = 0; i < a.length; i++) {
				if(arr.snt(a[i]))
					out.write(a[i]+" ");
			}
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
