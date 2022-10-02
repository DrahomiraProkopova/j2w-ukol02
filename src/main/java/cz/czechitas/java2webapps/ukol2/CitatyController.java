package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class CitatyController {

    private final Random random = new Random();
    private final String citat1 = "Neučíme se pro školu, ale pro život.";
    private final String citat2 = "Náš život je takový, jakým ho učiní naše myšlenky.";
    private final String citat3 = "Přítel je člověk, který zná melodii tvého srdce, který ti ji předzpívá, když ji zapomeneš.";
    private final String citat4 = "Stáří se nevysmívej – vždyť k němu směřuješ.";



    @GetMapping("/")
    public ModelAndView vyberCitat() {
        int vybraneCisloCitatu = random.nextInt(4) + 1;
        String obrazekIdentifikace = "";
        String citat = "";
        if (vybraneCisloCitatu == 1) {
            citat = citat1;
            obrazekIdentifikace = "L6sZJ3ToiwY";
        }
        if (vybraneCisloCitatu == 2) {
            citat = citat2;
            obrazekIdentifikace = "l-z44pz4mlM";
        }
        if (vybraneCisloCitatu == 3) {
            citat = citat3;
            obrazekIdentifikace = "A2FgDXG7OX0";
        }
        if (vybraneCisloCitatu == 4) {
            citat = citat4;
            obrazekIdentifikace = "4mmLiqfX_6s";
        }
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("citat", citat);
        modelAndView.addObject("obrazekIdentifikace", obrazekIdentifikace);
        return modelAndView;
    }
}
