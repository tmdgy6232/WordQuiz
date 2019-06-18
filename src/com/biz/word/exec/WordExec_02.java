package com.biz.word.exec;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.word.service.WordService;

public class WordExec_02 {

	public static void main(String[] args) {

		String wordtxt = "src/com/biz/word/exec/word.txt";
		WordService ws;
		
		try {
			
			ws = new WordService(wordtxt);
			while(true) {
			ws.readWordList();
			ws.makeQuiz();
			ws.pickQuiz();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
}
