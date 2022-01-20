import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadingFrommExcel {
	public static String getCellValue(String path, String sheet, int r, int c) {
		String v = "";
		try {
			FileInputStream fis = new FileInputStream("./Data/input.xlsx");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			v = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			wb.close();

		} catch (Exception e) {

		}
		return v;
	}

	public static void main(String[] args) {

		System.out.println(getCellValue("a", "formdata", 1, 1));

	}

}
