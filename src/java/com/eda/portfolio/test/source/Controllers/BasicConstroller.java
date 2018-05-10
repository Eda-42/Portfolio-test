/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eda.portfolio.test.source.Controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gazelle
 */
@Controller
public class BasicConstroller {

	@RequestMapping("/")
	public String getPlop(Model model) {
		model.addAttribute("message", "Plop!");

		//Java 8 LocalDate
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date = LocalDate.now();
		model.addAttribute("date", date.format(formatter));

		return "index";
	}

}
