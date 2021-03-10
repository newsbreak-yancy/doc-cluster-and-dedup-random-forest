package com.nb.randomforest.config;

import lombok.Getter;

import com.nb.randomforest.entity.EventFeature.TokenizerType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
    @Getter
    @Value("${feature.tokenizer.type}")
    private TokenizerType featureTokenizerType;
}

