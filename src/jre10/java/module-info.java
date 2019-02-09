module com.jwebmp.plugins.jqueryuidatetimepicker {
	exports com.jwebmp.plugins.jquidatetimepicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQueryUIDateTimePickerPageConfigurator;

	provides IGuiceScanJarExclusions with com.jwebmp.plugins.jquidatetimepicker.implementations.JQueryUIDateTimePickerExclusionsModule;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.jquidatetimepicker.implementations.JQueryUIDateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.jquidatetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
