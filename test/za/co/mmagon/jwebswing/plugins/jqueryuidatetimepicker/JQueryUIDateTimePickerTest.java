package za.co.mmagon.jwebswing.plugins.jqueryuidatetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.Page;

public class JQueryUIDateTimePickerTest extends BaseTestClass
{
	@Test
	public void getOptions() throws Exception
	{
		JQueryUIDateTimePicker picker = new JQueryUIDateTimePicker();
		Page p = getInstance();
		p.getOptions().setDynamicRender(true);
		
		System.out.println(p.toString(0));
	}
	
	@Test
	public void getOptionsTest() throws Exception
	{
		JQueryUIDateTimePicker picker = new JQueryUIDateTimePicker();
		Page p = getInstance();
		
		picker.getOptions().setDatePicker(true);
		picker.getOptions().setFormat("yyyy-MM-dd");
		picker.getOptions().setTheme("dark");
		picker.getOptions().setInLine(true);
		picker.getOptions().setTimePicker(true);
		picker.getOptions().setWeeks(true);
		p.getOptions().setDynamicRender(false);
		
		p.add(picker);
		
		System.out.println(p.toString(0));
	}
	
	@Test
	public void getTagTest() throws Exception
	{
		JQueryUIDateTimePicker picker = new JQueryUIDateTimePicker();
		Page p = getInstance();
		
		picker.getOptions().setDatePicker(true);
		picker.getOptions().setFormat("yyyy-MM-dd");
		picker.getOptions().setTheme("dark");
		picker.getOptions().setInLine(true);
		picker.getOptions().setTimePicker(true);
		picker.getOptions().setWeeks(true);
		p.getOptions().setDynamicRender(false);
		
		p.add(picker);
		
		System.out.println(picker.toString(0));
	}
}
