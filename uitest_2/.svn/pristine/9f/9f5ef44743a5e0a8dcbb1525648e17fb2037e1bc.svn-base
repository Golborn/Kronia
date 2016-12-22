package cl.entel.test.util;

import java.util.Map;
import java.util.Properties;
import org.apache.logging.log4j.Logger;

public class MyProperties {

	private static final String PROPERTIES = "uitest.properties";

	Map<String, String> env = System.getenv();
	Properties prop = new Properties();
	Logger log = null;

	public MyProperties(Logger log) {
		this.log = log;
		try {
			this.prop.load(MyProperties.class.getClassLoader().getResourceAsStream(PROPERTIES));
		} catch(Exception e) {
			if(log != null) log.error("Error cargando " + PROPERTIES + ": " + e);
		}
	}

	public MyProperties() {
		this(null);
	}

	/**
	 * Devuelve valor de una propiedad de configuración. El nombre de la propiedad
	 * es como aparece en uitest.properties, por ejemplo, foo.bar
	 * Si existe una variable de ambiente con un nombre similar, FOO_BAR, entonces
	 * el valor de esta variable de ambiente toma precedencia sobre foo.bar
	 * Esto permite hacer override dinámico de propiedades simplemente definiendo
	 * variables de ambiente. Si no se encuentra ninguna foo.bar en el archivo
	 * properties o en una variable de ambiente, se usa defaultValue.
	 *
	 * @param name         nombre de propiedad como aparece en uitest.properties
	 * @param defaultValue valor por defecto para name
	 * @return valor de propiedad
	 */
	public String property(String name, String defaultValue) {
		String value = defaultValue;

		// Para name == foo.bar, buscar en el ambiente una FOO_BAR con precedencia
		String envName = name.replace('.', '_').toUpperCase();
		if(env.get(envName) != null) {
			value = env.get(envName);
		} else {
			// Si no hay una FOO_BAR, buscar en el archivo .properties una name == foo.bar
			if(prop.getProperty(name) != null) value = prop.getProperty(name);
		}
		return value;
	};
}
