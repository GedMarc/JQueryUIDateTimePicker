package com.jwebmp.plugins.jqueryuidatetimepicker.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQueryUIDateTimePickerExclusionsModule
		implements IGuiceScanModuleExclusions<JQueryUIDateTimePickerExclusionsModule>,
				           IGuiceScanJarExclusions<JQueryUIDateTimePickerExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-jqueryui-datetime-picker-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqueryuidatetimepicker");
		return strings;
	}
}
