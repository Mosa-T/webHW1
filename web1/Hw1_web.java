package web1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Hw1_web {
	public static void main(String[] args) throws IOException {
		File file = new File("webpage.html");
		file.createNewFile();
		FileWriter writer;
		System.out.print("Please insert how many columns you want :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int n = number; 
		number = 100/number;
		try {
			writer = new FileWriter(file);
			writer.write("<html>\r\n" + 
					"    <head>\r\n" + 
					"        <title>\r\n" + 
					"            ex4\r\n" + 
					"        </title>\r\n" + 
					"        <style>\r\n" + 
					"            .red{background-color:red;}\r\n" + 
					"            .blue{background-color:blue;}\r\n" + 
					"            .green{background-color:green;}\r\n" + 
					"            .yellow{background-color:yellow;}\r\n" + 
					"            .customSize{width:" + number + "%;height:100%;}\r\n" + 
					"            .pullLeft{float:left}\r\n" + 
					"        </style>\r\n" + 
					"    </head>\r\n" + 
					"    <body style=\"margin: 0;\">");
			for(int i =0 ; i < n ; i++ )
			{
				writer.write("        <div class=\""+ getColor(i) + " customSize pullLeft\"></div>\r\n" + 
						"");
			}
			writer.write("    </body>\r\n" + 
					"</html>");
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
		input.close();
	}
	
	static String getColor(int i)
	{
		if(i%3 == 0 )
		{
			return "blue";
		}
		if(i%3 == 1)
		{
			return "red";
		}
		return "green";
	}
}
