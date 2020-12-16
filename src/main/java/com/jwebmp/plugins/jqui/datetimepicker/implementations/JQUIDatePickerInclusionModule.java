package com.jwebmp.plugins.jqui.datetimepicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class JQUIDatePickerInclusionModule implements IGuiceScanModuleInclusions<JQUIDatePickerInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.jqui.datetimepicker");
		return set;
	}
}
