package za.co.mmagon.jwebswing.plugins.jqueryuidatetimepicker;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

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
		pluginLastUpdatedDate = "2017/08/28"
)
public class JQueryUIDateTimePickerPageConfigurator extends PageConfigurator
{
	/**
	 * Configures the page for this component
	 */
	public JQueryUIDateTimePickerPageConfigurator()
	{
		//Nothing Needed
	}
	
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			page.getBody().addJavaScriptReference(JQueryUIDateTimePickerReferencePool.UIDateTImePickerReference.getJavaScriptReference());
			page.getBody().addCssReference(JQueryUIDateTimePickerReferencePool.UIDateTImePickerReference.getCssReference());
		}
		return page;
	}
}
