package com.example.tasty.chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    //접두사로 차이점을 두고 chat룸을 생성하고 진행ㅎ나다

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry){
        registry.setApplicationDestinationPrefixes("/app");// 사용자가 서버에 데이터를 보낼 주소
        registry.enableSimpleBroker("/chatroom","/user");  //해당 api를 구독하고 있는 클라에게 메세지 전달
        registry.setUserDestinationPrefix("/user");//클라로부터 메세지 받을 prefix
    }


    @Override
    //connection 을 맺을 때 cors허용
    public void registerStompEndpoints(StompEndpointRegistry registry){
        registry.addEndpoint("/chat/ws").setAllowedOriginPatterns("*").withSockJS();
    }
}
