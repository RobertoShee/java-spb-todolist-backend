package com.chrisloarryn.todolistapi.configuration.mappers;

import com.chrisloarryn.todolistapi.utils.mappers.ModelMapperManager;
import com.chrisloarryn.todolistapi.utils.mappers.ModelMapperService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public ModelMapperService getModelMapperService(ModelMapper mapper) {
        return new ModelMapperManager(mapper);
    }
}