import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // CORS pour  commercial
        registry.addMapping("commercial")
                .allowedOrigins("http://localhost:4200") // Angular
                .allowedMethods("GET", "POST")
                .allowedHeaders("*")
                .allowCredentials(true);

     
        registry.addMapping("responsablerh")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
