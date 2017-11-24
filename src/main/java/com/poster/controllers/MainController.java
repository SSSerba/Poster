package com.poster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sergiis on 11/24/2017.
 */
@Controller
public class MainController {


    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateBD() {
//		for(Country country : getCountries()){
//		countryService.saveOrUpdate(country);
//		}
        return "redirect:/";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getFromBD() {
//		for(Country country : getCountries()){
//		countryService.saveOrUpdate(country);
//		}
        return "redirect:/";
    }

}
