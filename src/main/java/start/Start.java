package start;

import java.io.IOException;
import java.util.logging.Logger;

import presentation.Controller;
import presentation.View;

/**
 * @Author: Blajan George-Paul
 */
public class Start {
    protected static final Logger LOGGER = Logger.getLogger(Start.class.getName());

    public static void main(String[] args) throws IOException {

        View view = new View();
        new Controller(view);

    }

}
