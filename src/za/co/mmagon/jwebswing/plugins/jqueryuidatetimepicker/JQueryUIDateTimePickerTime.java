package za.co.mmagon.jwebswing.plugins.jqueryuidatetimepicker;

import com.fasterxml.jackson.annotation.JsonValue;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

public class JQueryUIDateTimePickerTime extends JavaScriptPart<JQueryUIDateTimePickerTime>
{
	private Integer hour;
	private Integer minute;

	public JQueryUIDateTimePickerTime()
	{
		//Nothing Needed
	}

	public Integer getHour()
	{
		return hour;
	}

	public void setHour(Integer hour)
	{
		this.hour = hour;
	}

	public Integer getMinute()
	{
		return minute;
	}

	public void setMinute(Integer minute)
	{
		this.minute = minute;
	}

	@JsonValue
	@Override
	public String toString()
	{
		return new StringBuilder().append("").append(hour).append(":").append(minute).toString();

	}
}
