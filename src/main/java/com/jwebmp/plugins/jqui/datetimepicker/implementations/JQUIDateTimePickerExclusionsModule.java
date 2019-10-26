package com.jwebmp.plugins.jqui.datetimepicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQUIDateTimePickerExclusionsModule
		implements IGuiceScanModuleExclusions<JQUIDateTimePickerExclusionsModule>,
				           IGuiceScanJarExclusions<JQUIDateTimePickerExclusionsModule>
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
		strings.add("com.jwebmp.plugins.jquidatetimepicker");
		return strings;
	}
}
