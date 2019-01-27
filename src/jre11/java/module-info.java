module com.jwebmp.plugins.jqueryuidatetimepicker {
	exports com.jwebmp.plugins.jqueryuidatetimepicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.jqueryuidatetimepicker.JQueryUIDateTimePickerPageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.jqueryuidatetimepicker.implementations.JQueryUIDateTimePickerExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.jqueryuidatetimepicker.implementations.JQueryUIDateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.jqueryuidatetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
