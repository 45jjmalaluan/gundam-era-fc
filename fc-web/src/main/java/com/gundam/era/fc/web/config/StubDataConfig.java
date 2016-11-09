package com.gundam.era.fc.web.config;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.gundam.era.fc.core.model.MobileSuit;
import com.gundam.era.fc.core.model.Type;

@Configuration
public class StubDataConfig {
    @Bean
    public Map<UUID, MobileSuit> mobileSuits() {
        Map<UUID, MobileSuit> mobileSuits = new LinkedHashMap<>();
        mobileSuits.put(
            UUID.fromString("6398b646-8a4d-404b-a0f1-dc8aef04485a"),
            new MobileSuit(UUID
                .fromString("6398b646-8a4d-404b-a0f1-dc8aef04485a"),
                "GF13-017NJ Shining Gundam", Type.GUNDAM));
        mobileSuits.put(
            UUID.fromString("a71cbfcf-bbcd-458a-b071-b86869974ce9"),
            new MobileSuit(UUID
                .fromString("a71cbfcf-bbcd-458a-b071-b86869974ce9"),
                "GF13-001NH Kowloon Gundam", Type.GUNDAM));
        return mobileSuits;
    }
}
