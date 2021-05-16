package com.dvorobyev.aws.sandbox;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class AwsSandboxSimpleCdkStack extends Stack {
    public AwsSandboxSimpleCdkStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public AwsSandboxSimpleCdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here
    }
}
