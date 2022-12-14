package com.example.demo.week3.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service

public class OmikujiService {
    /**
     * <pre>
     * 【問題文】
     * getResultはおみくじを引いた結果を取得するメソッドです。
     * ・ランダムなおみくじの結果を取得する処理を記載してください。
     * ・おみくじの結果は変数resultに格納して返却してください 例.大吉
     * </pre>
     *
     * @return result おみくじの結果
     */
    public String getResult() {
    	String[] omikujis= {"大吉","中吉","凶"};
    	Random r=new Random();
    	String result=omikujis[r.nextInt(3)];
    	return result;

    }

    /**
     * <pre>
     * 【問題文】
     * getResultCommentは引数のresult(おみくじの結果)に紐づいた、コメントを返すメソッドです。
     * ・result(おみくじの結果)に紐づいた、コメントを取得する処理を記載してください。
     * ・コメントはresultCommentに格納して返却してください 例.大吉です、今日はとても良い日でしょう
     * ・条件分岐は引数で渡している'result'を用いてください
     * ※なお、引数のresultはgetResultメソッドで取得した結果が格納されています。
     * </pre>
     *
     * @param result おみくじの結果
     * @return resultComment おみくじ結果に対してのコメント
     */
    public String getResultComment(String result) {

        //おみくじの結果に紐づいた、コメントを定数として定義
    	String resultComment;
    	if(result.equals("大吉")) {
    		resultComment="大吉です。今日はとてもいい日になるでしょう";
    	}else if(result.equals("中吉")) {
    		resultComment="中吉です。今日はいい日になるでしょう";
    	}else {
    		resultComment="凶です。今日はよくない日になるでしょう";
    	}
    	return resultComment;

    }
}
