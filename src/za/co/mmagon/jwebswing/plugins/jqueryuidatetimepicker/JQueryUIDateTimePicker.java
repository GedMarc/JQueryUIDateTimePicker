/*
 * Copyright (C) 2017 Marc Magon
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
package za.co.mmagon.jwebswing.plugins.jqueryuidatetimepicker;

import za.co.mmagon.jwebswing.base.html.attributes.InputTypes;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.controls.BSInput;

/**
 * An implementation of
 * <p>
 * @author Marc Magon
 * @param <J>
 *
 * @since 17 Jan 2017
 * @version 1.0
 */
public class JQueryUIDateTimePicker<J extends JQueryUIDateTimePicker<J>>
        extends BSInput
{

    private static final long serialVersionUID = 1L;
    /**
     * The associated feature
     */
    private JQueryUIDateTimePickerFeature feature;

    /**
     * Constructs a new instance
     */
    public JQueryUIDateTimePicker()
    {
        super(InputTypes.Text);
        addFeature(getFeature());
    }

    /**
     * Returns the feature if any is required
     *
     * @return
     */
    public final JQueryUIDateTimePickerFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQueryUIDateTimePickerFeature(this);
        }
        return feature;
    }

    /**
     * Returns the options if any is required
     *
     * @return
     */
    @Override
    public JQueryUIDateTimePickerOptions getOptions()
    {
        return getFeature().getOptions();
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
        if (getClass() != obj.getClass())
        {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + (this.getID().hashCode());
        return hash;
    }

}