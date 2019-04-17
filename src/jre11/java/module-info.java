module com.jwebmp.plugins.jqui.datetimepicker {
	exports com.jwebmp.plugins.jqui.datetimepicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with  com.jwebmp.plugins.jqui.datetimepicker.JQUIDateTimePickerPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with  com.jwebmp.plugins.jqui.datetimepicker.implementations.JQUIDateTimePickerExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with  com.jwebmp.plugins.jqui.datetimepicker.implementations.JQUIDateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.jqui.datetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
