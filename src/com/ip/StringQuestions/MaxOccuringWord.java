package com.ip.StringQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxOccuringWord {

	public static void main(String[] args) {
		List<String> dict = Arrays.asList(
                "code", "coder", "coding", "codable", "codec", "codecs", "coded",
                "codeless", "codec", "codecs", "codependence", "codex", "codify",
                "codependents", "codes", "code", "coder", "codesign", "codec",
                "codeveloper", "codrive", "codec", "codecs", "codiscovered"
        );
		
		System.out.println(MaxOccWord(dict));
	}

	private static String MaxOccWord(List<String> dict) {
		
		if(dict == null)
			return "";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String s : dict) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		
		return null;
	}
}
