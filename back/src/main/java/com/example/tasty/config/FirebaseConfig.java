package com.example.tasty.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;


@Configuration
public class FirebaseConfig {
    @Value("${app.firebase-configuration-file}")
    private Resource resource;


    @PostConstruct
    public void initFirebase() {
        try {
            // Service Account를 이용하여 Fireabse Admin SDK 초기화
            FileInputStream serviceAccount =
                    new FileInputStream("E:\\final_mini\\posco_mini_back\\back\\src\\main\\resources\\keystore\\tasty-ca0bd-firebase-adminsdk-ywj7p-a0b5782d24.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))

                    .build();

            FirebaseApp.initializeApp(options);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
