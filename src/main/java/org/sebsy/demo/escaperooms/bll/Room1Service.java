package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("passage")
@Service
@Primary
public class Room1Service implements RoomService {

    @Override
    public String entreeSalle() {
        return "Bravo, vous avez trouvé la deuxième salle !";
    }

}
