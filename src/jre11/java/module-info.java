import com.jwebmp.plugins.jqui.datetimepicker.implementations.JQUIDatePickerInclusionModule;

module com.jwebmp.plugins.jqui.datetimepicker {
	exports com.jwebmp.plugins.jqui.datetimepicker;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqui.datetimepicker.JQUIDateTimePickerPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqui.datetimepicker.implementations.JQUIDateTimePickerExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with JQUIDatePickerInclusionModule;
	
	opens com.jwebmp.plugins.jqui.datetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
