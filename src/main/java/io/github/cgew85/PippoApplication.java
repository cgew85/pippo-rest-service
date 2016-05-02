package io.github.cgew85;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.pippo.core.Application;

import java.io.Serializable;

/**
 * Created by cgew85 on 02.05.2016.
 */
public class PippoApplication extends Application {

    @Override
    protected void onInit() {
        GET("/", routeContext -> routeContext.send("Hello world"));
        GET("/getsomedude", routeContext -> routeContext.json().send(new SomeDude("Some", "Dude", "Bodacious")));
    }

    @AllArgsConstructor
    class SomeDude implements Serializable {
        @Getter
        @Setter
        private String firstName;

        @Getter
        @Setter
        private String lastName;

        @Getter
        @Setter
        private String mood;
    }
}
