package com.safetynet.safetynetalerts.service.io;

import java.io.IOException;

public interface EntityIOService<E> {

    Boolean create (E entity) throws IOException;

    Boolean update (E entity) throws IOException;

    Boolean delete (E entity) throws IOException;

}
