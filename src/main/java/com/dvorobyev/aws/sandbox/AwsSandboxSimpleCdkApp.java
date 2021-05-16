package com.dvorobyev.aws.sandbox;

import dev.stratospheric.cdk.SpringBootApplicationStack;
import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.StackProps;

import static java.util.Objects.requireNonNull;

public class AwsSandboxSimpleCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        String accountId = (String) app.getNode().tryGetContext("accountId");
        requireNonNull(accountId, "context variable 'accountId' must not be null");

        String region = (String) app.getNode().tryGetContext("region");
        requireNonNull(region, "context variable 'region' must not be null");

        new SpringBootApplicationStack(
                app,
                "SpringBootApplication",
                makeEnv(accountId, region),
                "docker.io/mazaltov21/aws-sandbox-project-v1:latest"
        );

        app.synth();
    }

    private static Environment makeEnv(String accountId, String region) {
        return Environment.builder()
                .account(accountId)
                .region(region)
                .build();
    }
}
