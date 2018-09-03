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

package com.jwebmp.plugins.jqueryuidatetimepicker;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

@PluginInformation(pluginName = "JQuery UI Date Time Picker",
		pluginUniqueName = "jqueryui-datetime-picker",
		pluginDescription = "A nice JQuery UI Date Time Picker complete with theme roller capabilities",
		pluginVersion = "2.4.7",
		pluginDependancyUniqueIDs = "jquery-ui,jquery",
		pluginCategories = "Date Time Picker, JQuery UI, Drop Down",
		pluginSubtitle = "Date and Time for JQuery UI",
		pluginGitUrl = "https://github.com/xdan/datetimepicker.git",
		pluginSourceUrl = "https://github.com/GedMarc/JQueryUIDateTimePicker",
		pluginWikiUrl = "https://github.com/GedMarc/JQueryUIDateTimePicker/wiki",
		pluginOriginalHomepage = "https://github.com/xdan/datetimepicker",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQueryUIDateTimePicker.jar/download",
		pluginIconUrl = "jqueryuidatetimepicker.png",
		pluginIconImageUrl = "jqueryuidatetimepicker.png",
		pluginLastUpdatedDate = "2017/08/28")
public class JQueryUIDateTimePickerPageConfigurator
		implements IPageConfigurator
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Configures the page for this component
	 */
	public JQueryUIDateTimePickerPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return JQueryUIDateTimePickerPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQueryUIDateTimePickerPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody()
			    .addJavaScriptReference(JQueryUIDateTimePickerReferencePool.UIDateTImePickerReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(JQueryUIDateTimePickerReferencePool.UIDateTImePickerReference.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQueryUIDateTimePickerPageConfigurator.enabled;
	}
}
