package com.chips.stub;

import com.chips.stub.resources.RestResource;
import io.dropwizard.Application;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

public class ChipsStubApplication extends Application<ChipsStubConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ChipsStubApplication().run(args);
    }

    @Override
    public String getName() {
        return "DWGettingStarted";
    }

    @Override
    public void initialize(final Bootstrap<ChipsStubConfiguration> bootstrap) {
        bootstrap.addBundle(new MultiPartBundle());
    }

    @Override
    public void run(final ChipsStubConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new RestResource());
        environment.jersey().register(MultiPartFeature.class);

    }

}
