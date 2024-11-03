package hkn7b.dev.appservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@Profile("test")
class AppServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
