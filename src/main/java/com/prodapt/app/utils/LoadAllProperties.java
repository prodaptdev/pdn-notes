package com.prodapt.app.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "service")
public class LoadAllProperties {
	private String name;
}
