package utility;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ExcelReader {
   		public static XSSFWorkbook xWb;
		public static void main(String[] args) {
		System.out.println("The value of date is "+excelData("add2" +
				""));
	}
		public static String excelData(String value)
		{
			String excellPath="src/test/resources/Data/Data.xlsx";
			String sheetName="form";
			String data = null;
			try {
				//create object of file class to get excell path
				File src = new File(excellPath);
				//to read the file
				FileInputStream fis = new FileInputStream(src);
				xWb=new XSSFWorkbook(fis);
				XSSFSheet sheet=xWb.getSheet(sheetName);
				for(int i=0;i<sheet.getLastRowNum();i++)
				{
					String str1=sheet.getRow(i).getCell(0).getStringCellValue();
//		            	System.out.print(str1+" ");
					Row row=sheet.getRow(i);
					for(int j=1;j<row.getLastCellNum();j++)
					{
						try
						{
							if(row.getCell(0).toString().toLowerCase().contains(value))
							{
								if(row.getCell(j).getCellType()== CellType.STRING)

								{
									String str=row.getCell(j).getStringCellValue();
//				        					System.out.println(" "+str);
									data= str;
								}
								else if(row.getCell(j).getCellType()==CellType.NUMERIC)
								{
									double num= row.getCell(j).getNumericCellValue();
									if(row.getCell(0).toString().toLowerCase().contains("date"))
									{
										Date date=row.getCell(j).getDateCellValue();
										SimpleDateFormat myFormatObj = new SimpleDateFormat("dd/MM/yyyy");
										String formattedDate = myFormatObj.format(date);
//				            			    System.out.println("After formatting: " + formattedDate);
										data= formattedDate;
									}
									else
									{
										if(num<Math.pow(2, 31) )
										{
											int z=(int)num;
//				    		                        	System.out.println(" "+z);
											data= z+"";

										}
										else if(num>Math.pow(2, 31))
										{
											String da =(long)num+"";
//				    		                        	System.out.println(" "+da);
											data= da;
										}
									}
								}
							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			return data;
		}
}
