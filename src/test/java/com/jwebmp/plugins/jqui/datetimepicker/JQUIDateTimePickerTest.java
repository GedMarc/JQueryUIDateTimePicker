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

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

public class JQUIDateTimePickerTest

{
	@Test
	public void getOptions()
	{
		JQUIDateTimePicker picker = new JQUIDateTimePicker();
		Page p = new Page();
		p.getOptions()
		 .setDynamicRender(true);

		System.out.println(p.toString(0));
	}

	@Test
	public void getOptionsTest()
	{
		JQUIDateTimePicker picker = new JQUIDateTimePicker();
		Page p = new Page();

		picker.getOptions()
		      .setDatePicker(true);
		picker.getOptions()
		      .setFormat("yyyy-MM-dd");
		picker.getOptions()
		      .setTheme("dark");
		picker.getOptions()
		      .setInLine(true);
		picker.getOptions()
		      .setTimePicker(true);
		picker.getOptions()
		      .setWeeks(true);
		p.getOptions()
		 .setDynamicRender(false);

		p.add(picker);

		System.out.println(p.toString(0));
	}

	@Test
	public void getTagTest()
	{
		JQUIDateTimePicker picker = new JQUIDateTimePicker();
		Page p = new Page();

		picker.getOptions()
		      .setDatePicker(true);
		picker.getOptions()
		      .setFormat("yyyy-MM-dd");
		picker.getOptions()
		      .setTheme("dark");
		picker.getOptions()
		      .setInLine(true);
		picker.getOptions()
		      .setTimePicker(true);
		picker.getOptions()
		      .setWeeks(true);
		p.getOptions()
		 .setDynamicRender(false);

		p.add(picker);

		System.out.println(picker.toString(0));
	}
}
