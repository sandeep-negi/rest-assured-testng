package config;

import org.aeonbits.owner.Config;

/*
 PropertyConfig interface will extends Config from Owner API

In @Config.sources we have given path of config.properties file
 */

@Config.Sources("classpath:config.properties")
public interface PropertyConfig extends Config {

    @Key("baseUrl")
    String baseUrl();

    @Key("connection.timeout")
    Integer connectionTimeout();

    @Key("socket.timeout")
    Integer socketTimeout();
}