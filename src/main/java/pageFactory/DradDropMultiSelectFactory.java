package pageFactory;
import static utility.ElementUtils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import static utility.Constants.*;

public class DradDropMultiSelectFactory {

	
	
	
//Drop
	private By dropTitle =By.xpath("//p[text()=' Drop ']");
	private By drop1=By.cssSelector("a[href*='/dropable']");
			private By drop2=By.xpath("//a[@href='/dropable']");
			
	private By dropDagable=By.id("draggable");
	private By dropText=By.id("text");
	private By dropDropable=By.id("droppable");
	private By dropDropableText=By.cssSelector("div#droppable>p");
	public void selectDrop()
	{
		try
		{
			javaThreadwait();
			scrollToElement(dropTitle);
			javaThreadwait();
			click(drop2);
			javaThreadwait();
		}catch(Exception e)
		{
			click(drop1);
		}
		finally
		{
			System.out.println("Drop element AU_2 clicked");
		}
	}
	private int xco,yco,height,width;
	public void findDimensionAndcoOrdinatesofDragableElement()
	{
		
		xco=coordinate(dropDagable).getX();
		yco=coordinate(dropDagable).getY();
		
		height=dimension(dropDagable).height;
		width=dimension(dropDagable).width;
		javaThreadwait();
		System.out.println("The x co-ordinate of the element is : -"+xco);
		System.out.println("The y co-ordinate of the element is : -"+yco);
		javaThreadwait();
		System.out.println("The height of the element is : -"+height);
		System.out.println("The width of the element is : -"+width);
		
			}
	public void dragdragable()
	{
		javaThreadwait();
		dragAndDropByMethod(dropDagable, dropDropable);
	}
//MultiSelect
	private By multiSelectTitle =By.xpath("//p[text()=' Multi-Select ']");
	private By multiSelect=By.cssSelector("a[href*='/selectable']");
	private By selectable=By.id("selectable");
	public void selectMultiSelect()
	{
		try
		{
			javaThreadwait();
			scrollToElement(multiSelectTitle);
			javaThreadwait();
			click(multiSelect);
			javaThreadwait();
		}catch(Exception e)
		{
			click(multiSelect);
		}
		finally
		{
			System.out.println("Drop element Multi-select clicked");
		}
	}
	public void getelements()
	{
		
		for(WebElement e:BYs(selectable))
		{
			System.out.println("The allselectable elements are " +e.getText());
		}
	}
	public void selectAllElements()
	{
		continuousClick(selectable);
		
	}

}
