package com.example.storydashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorydashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorydashboardApplication.class, args);
    }

}


// 맘대로 공통을 만들지 말고 먼저 물어보고 행동 멋대로 추가하거나 그러면 관리가 안된다.
// 파트가 나누어져 있는데 common common
// 전체 커먼이 있을 수 있다. 이런걸 잘 보아야 한다. 여기에 넣는다.
// CI, CD 배포, 파이프라인 공통 -> 전체적인 흐름이 어떻게 되는지. 분석을 시킬텐데 어떻게 분석하는지가 중요하다.