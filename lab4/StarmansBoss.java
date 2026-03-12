package lab4;

import java.util.Collection;

public class StarmansBoss {

    public int getCollectiveAge(Collection<Astronaut> o) {
        int collectiveAge = 0;
        for (Astronaut astronaut : o) {
            collectiveAge += astronaut.getAge();
        }
        return collectiveAge;
    }
}
