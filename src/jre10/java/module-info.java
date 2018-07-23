import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqueryuidatetimepicker.JQueryUIDateTimePickerPageConfigurator;

module com.jwebmp.plugins.jqueryuidatetimepicker {
	exports com.jwebmp.plugins.jqueryuidatetimepicker;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.bootstrap;

	provides IPageConfigurator with JQueryUIDateTimePickerPageConfigurator;

}
