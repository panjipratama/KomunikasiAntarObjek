package pegawai;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class SimpanPegawai {
	public static void main (String [] args) throws Exception
	{
		boolean cek = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pegawai peg = new Pegawai ("",0,0);
		
		System.out.print("Berapa data yang akan anda masukkan : ");
		int index = Integer.parseInt(br.readLine());
		for (int x = 0 ; x < index;x++)
		{
			cek = true;
			System.out.println("data ke : "+(x+1));
			System.out.print("Nama : ");
			String nama = br.readLine();
			System.out.print("Umur : ");
			int umur = Integer.parseInt(br.readLine());
			System.out.print("Gaji : ");
			int gaji = Integer.parseInt(br.readLine());
			
			peg = new Pegawai(nama,umur,gaji);
			try
			{
				FileOutputStream fos = new FileOutputStream("db");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(peg);
				oos.flush();
				cek = false;
			}catch(Exception e)
			{
				System.out.println("error : "+e);
			}
		}
		if (cek == false)
		{System.out.println("Data Berhasil Disimpan !");}
		else
		{System.out.println("Data Gagal Disimpan !");}
	}

}
