package insideworld.quarkus.bug;

import io.quarkus.arc.All;
import jakarta.inject.Singleton;
import java.util.List;

@Singleton
public class BeanA {

    private final List<Some<?>> somes;

    public BeanA(@All List<Some<?>> somes) {
        this.somes = somes;
    }

}
