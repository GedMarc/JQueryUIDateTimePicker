import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.jqueryuidatetimepicker.JQueryUIDateTimePickerPageConfigurator;

module com.jwebmp.plugins.jqueryuidatetimepicker {
	exports com.jwebmp.plugins.jqueryuidatetimepicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQueryUIDateTimePickerPageConfigurator;

	provides IGuiceScanJarExclusions with com.jwebmp.plugins.jqueryuidatetimepicker.implementations.JQueryUIDateTimePickerExclusionsModule;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.jqueryuidatetimepicker.implementations.JQueryUIDateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.jqueryuidatetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
}
