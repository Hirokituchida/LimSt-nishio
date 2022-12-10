package com.example.demo.week4.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class EndlessOmikujiService {
    /**
     * <pre>
     * 【問題文】
     * getResultはおみくじを引いた結果が"凶"になるまで繰り返しおみくじを引き続けるメソッドです。
     * ・ランダムなおみくじの結果を取得する処理を記載してください。
     * ・おみくじの結果が凶になるまで、繰り返しおみくじの結果を取得してください。
     * ・おみくじの結果は変数resultに格納して返却してください。 例.凶
     * なお、
     * </pre>
     *
     * @return result おみくじの結果
     */
    public String getResult() {
    	String[] omikuji= {"大吉","中吉","凶"};
    	Random r=new Random();
    	String result;
    	while(true) {
    		result=omikuji[r.nextInt(3)];
    		if(result.equals("凶")) {
    			break;
    		}
    	}
    	return result;
    }

    /**
     * <pre>
     * 【問題文】
     * getResultCommentは引数のresult(おみくじの結果)に紐づいた、コメントを返すメソッドです。
     * ・無限おみくじの仕様に沿ったコメントを取得する記述をしてください。
     * ・コメントはresultCommentに格納して返却してください。 例.凶です、今あなたの後ろに・・・
     * ※なお、引数のresultはメソッドgetResultで取得した結果が格納されています。
     * </pre>
     *
     * @return resultComment 無限おみくじの仕様に沿ったコメント
     */
    public String getResultComment() {
    	String resultComment;
    	if(getResult().equals("大吉")) {
    		resultComment="大吉です。すごくいい日になるでしょう";
    	}else if(getResult().equals("中吉")) {
    		resultComment="中吉です。いい日になるでしょう";
    	}else {
    		resultComment="凶です。今あなたの後ろに・・・";
    	}
    	return resultComment;
    }
}
