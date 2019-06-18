package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {
	Scanner scan;
	List<String> wordList;
	String word;
	String wordtxt = "src/com/biz/word/exec/word.txt";
	FileReader fileReader;
	BufferedReader buffer;

	public WordService(String wordtxt) throws FileNotFoundException {
		scan = new Scanner(System.in);
		wordList = new ArrayList<String>();
		word = new String();
		fileReader = new FileReader(wordtxt);
		buffer = new BufferedReader(fileReader);
	}
	/* word.txt 파일로부터 단어 리스트를 읽어서
	 * wordList에[ 추가하시오
	 */
	public void readWordList() throws IOException {
		
		while(true) {
		String wo = buffer.readLine();
		if(wo == null)break;
		wordList.add(wo);
		}
		
	}
	
	public void inputWordList() {
		wordList.add("korea");
		wordList.add("America");
		wordList.add("England");
		wordList.add("German");
		wordList.add("Aprica");
		wordList.add("France");
	}

	public void makeQuiz() {
		Collections.shuffle(wordList);
		word = wordList.get(0);

		String[] arrWord = word.split("");
		List<String> apList = new ArrayList<String>(Arrays.asList(arrWord));
		Collections.shuffle(apList);

		System.out.println("======================================");
		System.out.println(apList);
		System.out.println("======================================");

	}

	public boolean pickQuiz() {
		System.out.println("제시된 알파벳의 단어를 맞추시오1!");
		System.out.println("종료 : --END");
		String strKeyInput = scan.nextLine();
		if(strKeyInput.equals("--END")) return true;
		if (word.equalsIgnoreCase(strKeyInput)) {
			System.out.println("참 잘했어요");
		} else {
			System.out.println("단어선택을 잘못했네요");
		}

		return false;
	}
}
