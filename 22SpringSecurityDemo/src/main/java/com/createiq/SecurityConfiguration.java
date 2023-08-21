package com.createiq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails user1=User.builder()
//		        .username("yamini")
//		        .password(passwordEncoder().encode("yamini"))
//		        .roles("hello")
//		        .build();
//		return new InMemoryUserDetailsManager(user1);
//		
//	}
	
	//@Bean
	//with Bcrypt password encoder
//	public UserDetailsService userDetailsService() {
//		UserDetails user=User.builder().username("user").password(passwordEncoder().encode("user")).roles("USER").build();
//		UserDetails admin=User.builder().username("admin").password(passwordEncoder().encode("admin")).roles("ADMIN").build();
//		
//		return new InMemoryUserDetailsManager(user,admin);
//		
//	}
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
	
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	

	@Autowired 
	private PasswordEncoder passwordEncoder;
	
	
	@Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
	 	httpSecurity.csrf((csrf)->csrf.disable());
   
	   httpSecurity.authorizeHttpRequests((authorizeHttpRequests)->{
		   authorizeHttpRequests.requestMatchers("/public","/signup").permitAll();
		   authorizeHttpRequests.requestMatchers("/hello").authenticated();
			authorizeHttpRequests.requestMatchers("/admin").hasRole("admin");
			authorizeHttpRequests.requestMatchers("/user").hasRole("user"); 
			
		   
	   });
	   httpSecurity.formLogin(Customizer.withDefaults());
		return httpSecurity.build();
	
}
	
	
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }
}
