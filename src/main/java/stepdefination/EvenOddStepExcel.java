package stepdefination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EvenOddStepExcel {
	int x,y,result;
	@Given("User has Two Number from {int}")
	public void acceptNumbers(int rowNum) {
		FileInputStream fis=null;
		try {
			fis= new FileInputStream("C:\\Users\\Dell\\Desktop\\BDDExcel.xlsx");
			XSSFWorkbook book=new XSSFWorkbook(fis);
			XSSFSheet sheet= book.getSheet("Sheet1");
			Row row=sheet.getRow(rowNum);
			x=(int) row.getCell(1).getNumericCellValue();
			y=(int) row.getCell(2).getNumericCellValue();
					
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("User add two numbers from excel")
	public void addNumbers() {
		result=x+y;
	}
	@Then("Addition result must be even from Excel")
	public void checkIfAdditionIsEven() {
		System.out.println("Addition of Both number: "+result);
		int rem= result%2;
		Assert.assertEquals(0, rem);
	}

}
