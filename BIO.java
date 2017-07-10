package SVM;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class BIO
{
	private static List<String> tokens = new ArrayList<String>();
	private static List<String> lables = new ArrayList<String>();

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		// myDr.svmProcess();
		tokens = getData1("D:\\clinictemp\\biomedical\\word2vecTools\\types.txt");
		getData2("D:\\clinictemp\\biomedical\\word2vecTools\\vectors.txt");

	}

	private static List<String> getData1(String filename)
	{
		List<String> tokens = new ArrayList<String>();

		try
		{
			FileReader fr = new FileReader(new File(filename));
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null)
			{
				tokens.add(line);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return tokens;
	}

	private static void getData2(String filename)
	{
		// List<String> lables = new ArrayList<String>();
		try
		{
			FileReader fr = new FileReader(new File(filename));
			BufferedReader br = new BufferedReader(fr);
			String outputFilepath = "D:\\clinictemp\\data\\biovector.txt";
			FileWriter outfile = new FileWriter(outputFilepath, true);
			String line = null;
			int i = 0;
			while ((line = br.readLine()) != null)
			{
				// System.out.println(line);
				outfile.write(tokens.get(i) + " " + line + "\r\n");
				// lables.add(line);
				System.out.println(tokens.get(i) + " " + line);
				i++;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}