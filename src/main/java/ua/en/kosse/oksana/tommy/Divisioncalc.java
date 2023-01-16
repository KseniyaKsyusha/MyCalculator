package ua.en.kosse.oksana.tommy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class Divisioncalc {

    @Autowired
    public static int oper(int valA, int valB) {
        return valA / valB;
    }
}
