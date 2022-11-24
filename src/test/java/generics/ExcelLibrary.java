package generics;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant {

	public static String getCellValue(String path, String sheet, int row, int cell) throws Exception {

		FileInputStream fis = new FileInputStream(excel_path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellValue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;

	}

}
