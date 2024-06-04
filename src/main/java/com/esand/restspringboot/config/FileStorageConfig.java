package com.esand.restspringboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "file") // É o file escrito do application, do diretório do arquivo
public class FileStorageConfig {
    private String uploadDir; // Deve utilizar as mesmas palavras do atributo colocado após o file, não precisa ser o memso formato, mas temq que ter as mesmas palavras
}
