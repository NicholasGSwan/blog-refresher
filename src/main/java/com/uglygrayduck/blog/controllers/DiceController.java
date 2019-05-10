package com.uglygrayduck.blog.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DiceController {
	
	@GetMapping("/dice")
	public String diceRoll(Model model) {
		ArrayList<Integer> dice = new ArrayList<>();
		for(int i = 1; i <7; i++) {
			dice.add(i);
		}
		
		model.addAttribute("dice", dice);
		
		
		return "dice-roll";
	}
	@GetMapping("/dice/{guess}")
	public String diceRolled(@PathVariable Integer guess, Model viewModel) {
		int roll = (int) Math.floor(Math.random()*6 + 1);
		boolean guessMatchesRoll;
		if(roll == guess) {
			guessMatchesRoll = true;
		}else {
			guessMatchesRoll = false;
		}
		
		viewModel.addAttribute("guess", guess);
		viewModel.addAttribute("roll", roll);
		viewModel.addAttribute("guessMatchesRoll", guessMatchesRoll);
		
		return "dice-rolled";
	}
	

}
