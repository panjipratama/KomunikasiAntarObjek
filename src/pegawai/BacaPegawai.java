package pegawai;

import java.io.*;

public class BacaPegawai {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis = new FileInputStream("db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Pegawai aaa;
			while ((aaa = (Pegawai)ois.readObject()) != null)
			{
				aaa.print();
			}
			fis.close();
		}catch (IOException ioe)
		{
			System.exit(1);
		}
		catch (Exception e)
		{
			System.exit(1);
		}

	}

}
