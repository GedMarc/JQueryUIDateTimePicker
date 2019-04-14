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

import com.jwebmp.core.base.html.attributes.InputTypes;
import com.jwebmp.core.base.html.inputs.InputTextType;

/**
 * An implementation of
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
public class JQUIDateTimePicker<J extends JQUIDateTimePicker<J>>
		extends InputTextType<J>
{


	/**
	 * The associated feature
	 */
	private JQUIDateTimePickerFeature feature;

	/**
	 * Constructs a new instance
	 */
	public JQUIDateTimePicker()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the feature if any is required
	 *
	 * @return
	 */
	public final JQUIDateTimePickerFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIDateTimePickerFeature(this);
		}
		return feature;
	}

	/**
	 * Returns the options if any is required
	 *
	 * @return
	 */
	@Override
	public JQUIDateTimePickerOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		return getClass() == obj.getClass() && super.equals(obj);
	}

}
