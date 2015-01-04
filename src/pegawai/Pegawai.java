package pegawai;

import java.io.Serializable;

public class Pegawai implements Serializable 
{
	private String nama;
	private int umur;
	private int gaji;
	
	public Pegawai (String nama, int umur, int gaji)
	{
		this.nama=nama;
		this.umur=umur;
		this.gaji=gaji;
	}
	
	public void print()
	{
		System.out.println("Data untuk "+this.nama);
		System.out.println("Nama : "+this.nama);
		System.out.println("Umur : "+this.umur);
		System.out.println("Gaji : "+this.gaji);
	}
}


