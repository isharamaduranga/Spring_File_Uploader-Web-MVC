/**
 * @author : Ishara Maduarnga
 * Project Name: Spring_File_Uploader
 * Date        : 2/8/2023
 * Time        : 12:07 PM
 * Year        : 2023
 */

package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.spring.controller")
public class WebAppConfig {

}
