package it.epicode.be.prenotazioni.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage/{lang}")
public class PageController {

    @GetMapping
    public String getHomePageThymeleaf(ModelMap model, @PathVariable String lang) {
	model.addAttribute("langparam", lang);

	if (lang.equals("it")) {

	    return "Puoi prenotare una postazione solamente se la data scelta è disponibile."
		    + "Quando prenoti la tua pstazione devi inserire la città e l'edificio."
		    + "Una volta prenotata la postazione puoi vedere la data ed il giorno scelto.";
	} else if (lang.equals("en")) {
	    return "You can book a seat only if the chosen date is available."
		    + "When you book your station you have to enter the city and the building."
		    + "Once the station has been booked, you can see the date and day chosen.";
	}

	return "Lingua selezionata non disponibile";

    }

}
