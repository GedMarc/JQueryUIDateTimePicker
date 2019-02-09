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
package com.jwebmp.plugins.jqui.datetimepicker;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * All the options
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 4, 2015
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
		getterVisibility = JsonAutoDetect.Visibility.NONE,
		setterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JQUIDateTimePickerOptions
		extends JavaScriptPart
{


	/**
	 * Shows a date picker or not
	 */
	@JsonProperty("datepicker")
	private boolean datePicker;
	/**
	 * Sets the format of the date picker
	 */
	private String format;
	/**
	 * Sets the value in the given format option
	 */
	private String value;
	/**
	 * Sets the date picker inline
	 */
	@JsonProperty("inline")
	private Boolean inLine;
	/**
	 * Whether or not show weeks
	 */
	private Boolean weeks;
	/**
	 * The JQuery theme e.g. dark
	 */
	private String theme;
	/**
	 * Whether or not to show a time picker
	 */
	@JsonProperty("timepicker")
	private Boolean timePicker;
	/**
	 * A mask given for the input field when blank
	 */
	private String mask;

	/**
	 * The minimum time allowed
	 */
	private JQUIDateTimePickerTime minTime;
	/**
	 * The max time allowed
	 */
	private JQUIDateTimePickerTime maxTime;
	/**
	 * This list of minimum allowed times
	 */
	@JsonProperty("allowTimes")
	private List<JQUIDateTimePickerTime> allowTimes;

	/**
	 * The options for the component
	 */
	public JQUIDateTimePickerOptions()
	{
		//Nothing Needed
	}

	/**
	 * Shows a date picker or not
	 *
	 * @return
	 */
	public boolean isDatePicker()
	{
		return datePicker;
	}

	/**
	 * Sets a date picker
	 *
	 * @param datePicker
	 */
	public JQUIDateTimePickerOptions setDatePicker(boolean datePicker)
	{
		this.datePicker = datePicker;
		return this;
	}

	/**
	 * Sets the format of the date picker
	 *
	 * @return
	 */
	public String getFormat()
	{
		return format;
	}

	/**
	 * Sets the format of the date picker
	 *
	 * @param format
	 */
	public JQUIDateTimePickerOptions setFormat(String format)
	{
		this.format = format;
		return this;
	}

	/**
	 * Sets the value in the given format option
	 *
	 * @return
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value in the given format option
	 *
	 * @param value
	 */
	public JQUIDateTimePickerOptions setValue(String value)
	{
		this.value = value;
		return this;
	}

	/**
	 * Sets the date picker inline
	 *
	 * @return
	 */
	public Boolean getInLine()
	{
		return inLine;
	}

	/**
	 * Sets the date picker inline
	 *
	 * @param inLine
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setInLine(Boolean inLine)
	{
		this.inLine = inLine;
		return this;
	}

	/**
	 * Whether or not show weeks
	 *
	 * @return
	 */
	public Boolean getWeeks()
	{
		return weeks;
	}

	/**
	 * Whether or not show weeks
	 *
	 * @param weeks
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setWeeks(Boolean weeks)
	{
		this.weeks = weeks;
		return this;
	}

	/**
	 * The JQuery theme e.g. dark
	 *
	 * @return
	 */
	public String getTheme()
	{
		return theme;
	}

	/**
	 * The JQuery theme e.g. dark
	 *
	 * @param theme
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setTheme(String theme)
	{
		this.theme = theme;
		return this;
	}

	/**
	 * Whether or not to show a time picker
	 *
	 * @return
	 */
	public Boolean getTimePicker()
	{
		return timePicker;
	}

	/**
	 * Whether or not to show a time picker
	 *
	 * @param timePicker
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setTimePicker(Boolean timePicker)
	{
		this.timePicker = timePicker;
		return this;
	}

	/**
	 * A mask given for the input field when blank
	 *
	 * @return
	 */
	public String getMask()
	{
		return mask;
	}

	/**
	 * A mask given for the input field when blank
	 *
	 * @param mask
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setMask(String mask)
	{
		this.mask = mask;
		return this;
	}

	/**
	 * The minimum time allowed
	 *
	 * @return
	 */
	public JQUIDateTimePickerTime getMinTime()
	{
		return minTime;
	}

	/**
	 * The minimum time allowed
	 *
	 * @param minTime
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setMinTime(JQUIDateTimePickerTime minTime)
	{
		this.minTime = minTime;
		return this;
	}

	/**
	 * Returns the max time
	 *
	 * @return
	 */
	public JQUIDateTimePickerTime getMaxTime()
	{
		return maxTime;
	}

	/**
	 * The max time allowed
	 *
	 * @param maxTime
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setMaxTime(JQUIDateTimePickerTime maxTime)
	{
		this.maxTime = maxTime;
		return this;
	}

	/**
	 * This list of minimum allowed times
	 *
	 * @return
	 */
	public List<JQUIDateTimePickerTime> getAllowTimes()
	{
		if (allowTimes == null)
		{
			allowTimes = new ArrayList<>();
		}
		return allowTimes;
	}

	/**
	 * This list of minimum allowed times
	 *
	 * @param allowTimes
	 *
	 * @return
	 */
	public JQUIDateTimePickerOptions setAllowTimes(List<JQUIDateTimePickerTime> allowTimes)
	{
		this.allowTimes = allowTimes;
		return this;
	}
}
