@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
          .authorizeHttpRequests(a -> a
            .requestMatchers("/login", "/mfa").permitAll()
            .anyRequest().authenticated()
          )
          .formLogin(f -> f.loginPage("/login").permitAll())
          .logout(l -> l.logoutSuccessUrl("/login"));

        return http.build();
    }
}
