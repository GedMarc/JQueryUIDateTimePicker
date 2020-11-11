package com.jwebmp.plugins.jqui.datetimepicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQUIDateTimePickerExclusionsModule
		implements IGuiceScanModuleExclusions<JQUIDateTimePickerExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jquidatetimepicker");
		return strings;
	}
}
