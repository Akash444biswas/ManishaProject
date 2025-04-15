package com.pro.TeacherDashboard.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI teacherDashboardAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Teacher Dashboard API")
                        .description("API for managing teacher profiles and student enquiries")
                        .version("1.0"));
    }
}


