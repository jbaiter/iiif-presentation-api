/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datazuul.iiif.presentation.backend.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Backend configuration.
 *
 * @author ralf
 */
@Configuration
@ComponentScan(basePackages = {
  "com.datazuul.iiif.presentation.backend.repository.impl",
  "com.datazuul.iiif.presentation.backend.repository.resolver"
})
@PropertySource(value = {
  "classpath:org/mdz/iiifserver/config/SpringConfigBackendPresentation-${spring.profiles.active:PROD}.properties"
})
public class SpringConfigBackendPresentation {

  private static final Logger LOGGER = LoggerFactory.
          getLogger(SpringConfigBackendPresentation.class);

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }
}
