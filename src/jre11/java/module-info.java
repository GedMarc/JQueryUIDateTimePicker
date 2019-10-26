module com.jwebmp.plugins.jqui.datetimepicker {
	exports com.jwebmp.plugins.jqui.datetimepicker;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with  com.jwebmp.plugins.jqui.datetimepicker.JQUIDateTimePickerPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanJarExclusions with  com.jwebmp.plugins.jqui.datetimepicker.implementations.JQUIDateTimePickerExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with  com.jwebmp.plugins.jqui.datetimepicker.implementations.JQUIDateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.jqui.datetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
