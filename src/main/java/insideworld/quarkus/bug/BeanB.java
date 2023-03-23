package insideworld.quarkus.bug;

import io.quarkus.arc.All;
import jakarta.inject.Singleton;
import java.util.List;

@Singleton
public class BeanB {

    private final List<Some<?, ?>> somes;

    public BeanB(@All List<Some<?,?>> somes) {
        this.somes = somes;
    }

}
