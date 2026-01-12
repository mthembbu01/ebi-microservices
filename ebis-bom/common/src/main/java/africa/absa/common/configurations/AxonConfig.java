package africa.absa.common.configurations;

import com.thoughtworks.xstream.XStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Bean
    public XStream xtream() {
        XStream xstream = new XStream();
        xstream.allowTypesByWildcard(new String[] {"africa.absa.**"});

        return xstream;
    }
}
