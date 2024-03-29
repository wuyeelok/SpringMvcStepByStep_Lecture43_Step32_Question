package com.in28minutes.config;

import java.util.ResourceBundle;

import org.springframework.stereotype.Service;

@Service
public class ConfigUtilService {

	public String getSpringDispatcherURLPattern() {
		ResourceBundle rb = ResourceBundle.getBundle("springConfig");

		String urlPattern = rb.getString("DispatcherServletUrlPattern");

		if ("/".equals(urlPattern)) {
			return "";
		} else if (urlPattern.endsWith("/*")) {
			return (urlPattern.substring(0, urlPattern.length() - 2));
		}

		return urlPattern;
	}
}
