/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.jqueryuidatetimepicker;

import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

public class JQueryUIDateTimePickerTime
		extends JavaScriptPart<JQueryUIDateTimePickerTime>
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
		return new StringBuilder().append(hour)
		                          .append(":")
		                          .append(minute)
		                          .toString();

	}
}
