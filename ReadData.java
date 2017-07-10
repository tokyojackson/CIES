package DR;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadData
{
	public static void Data()
	{
		try
		{
			FileReader read = new FileReader("desc\\biovector.txt");
			BufferedReader br = new BufferedReader(read);
			String row;
			int rownum = 1;
			int i = 1;
			FileWriter fw = new FileWriter(i + ".txt", true);
			while ((row = br.readLine()) != null)
			{
				if (rownum / 10000 < i)
				{
					// System.out.println("i:" + i + "\trownum:" + rownum);
					fw.write(row + "\r\n");
				}
				else
				{
					fw.write(row + "\r\n");
					fw.flush();
					fw.close();
					i++;
					fw = new FileWriter(i + ".txt", true);
				}
				rownum++;
			}

		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		Data();

	}
}
