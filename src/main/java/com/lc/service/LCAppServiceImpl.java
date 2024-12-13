package com.lc.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class LCAppServiceImpl implements LCAppService {
	private static final String RELATIONSHIP_FORMULA = "FLAME";

	@Override
	public String calculate(String userName, String crushName) {

		Set<Character> finalCombinedNames = removeDuplicates(userName, crushName);
		int countOfNames = finalCombinedNames.size();
		int reminder = countOfNames % ((RELATIONSHIP_FORMULA).length());

		String Result = relationWithLetter(RELATIONSHIP_FORMULA.charAt(reminder));

		return Result;

	}

	private String relationWithLetter(char c) {
		switch (Character.toUpperCase(c)) {
		case 'F':
			return "Friend 😁";
		case 'L':
			return "Love 😍";
		case 'A':
			return "Affection !";
		case 'M':
			return "Marriage 😍";
		case 'E':
			return "Enemies 🤐";
		default:
			return "Unknown Relation"; // Handle unexpected characters
		}

	}

	private Set<Character> removeDuplicates(String userName, String crushName) {
		Set<Character> combinedChars = new HashSet<>();
		Set<Character> commonChars = new HashSet<>();

		// Add all characters from both strings to the combinedChars set
		for (char c : (userName + crushName).toCharArray()) {
			combinedChars.add(c);
		}

		// Find common characters between userName and crushName
		for (char c : userName.toCharArray()) {
			if (crushName.indexOf(c) != -1) {
				commonChars.add(c);
			}
		}

		// Remove all common characters from combinedChars
		combinedChars.removeAll(commonChars);

		return combinedChars;
	}

}
