package pga.com.api.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pga.com.api.models.User;
import pga.com.api.repositories.UserRepository;

@Configuration
public class Database {
  @Bean
  CommandLineRunner initDatabase(UserRepository userRepository) {
    return new CommandLineRunner() {
      @Override
      public void run(String... args) {
        var user = new User();
      }
    };
  }
}
